package com.jacksonh;

public class Caracol {
    private int[][] matriz;
    private int[] valores;
    private int linhas = 0,colunas=0;

    //função responsável por gerar as matrizes automaticamente recebendo quantidade de linhas e colunas. retorna em forma de matriz
    public int[][] Gerarmatriz(int linhas, int colunas){
        this.matriz = new int[linhas][colunas]; //cria matriz
        this.valores = new int[this.matriz.length*this.matriz[0].length];// Array só para o for da lógica funcionar.
        this.linhas = linhas; // qtd de linhas da matriz;
        this.colunas = colunas;// qtd de colunas da matriz;
        this.LogicaCaracol(); // gerando matriz caracol;
        return this.matriz; // retornando matriz caracol;
    }

    //variável responsá vel por pegar a matriz criada e retornala em forma de array
    public int[] PegarArray(int[][] matriz){
        this.matriz = matriz; // datermina a matriz
        this.valores = new int[this.matriz.length * this.matriz[0].length];// Array que armazenará os this.this.valores da this.this.matriz em ordem espiral

        this.linhas=0; // zerado para não interferir(usada na geração);
        this.colunas=0;// zerado para não interferir(usada na geração)
        this.LogicaCaracol();// pegando valores em espiral para array;
        return this.valores;// retornando valores da matriz em array;
    } 

    //função responsável por toda a lógica do sistema
    private void LogicaCaracol(){
        int tamLinha = this.matriz.length;
        int tamColuna = this.matriz[0].length;
        int linha = 0, coluna = -1, volta = 0;
        for (int i = 0; i < this.valores.length; i++) {
            linha = (coluna == volta && linha > volta) ? linha - 1 : linha;// Movimento para cima (linha decresce quando estamos na coluna "volta" e a linha é maior que "volta")
            coluna = (linha == tamLinha - 1 && coluna > volta) ? coluna - 1 : coluna;// Movimento para a esquerda (coluna decresce quando estamos na última linha e a coluna é maior que "volta")
            linha = (coluna == tamColuna - 1 && linha < tamLinha - 1) ? linha + 1 : linha;// Movimento para baixo (linha cresce quando estamos na última coluna e a linha é menor que "tamLinha - 1")
            coluna = (linha == volta && coluna < tamColuna - 1) ? coluna + 1 : coluna;// Movimento para a direita (coluna cresce quando estamos na primeira linha e a coluna é menor que "tamColuna - 1")
            if(this.linhas==0 && this.colunas==0){//Si linhas  diferente de 0 e colunas diferente de 0
                this.valores[i] = this.matriz[linha][coluna];//gera o array 
            }else{
                this.matriz[linha][coluna] = i+1;//gera a matriz
            }


            //parte responsável pela entrada no interior da matriz;
            if (linha == volta + 1 && coluna == volta) {
                tamColuna--;  // Reduz o número de colunas para percorrer
                tamLinha--;   // Reduz o número de linhas para percorrer
                volta++;      // Avança para a próxima volta
                coluna = volta - 1;  // Reseta a coluna para a posição da nova volta
                linha = volta;       // Reseta a linha para a nova volta
            }
        }
    }
}
/*
    linha = coluna == volta && linha <= tamLinha - 1 && linha != volta && (tamColuna-1 != volta && tamLinha-1 != volta)? linha - 1 : linha;
    coluna = linha == tamLinha - 1 && coluna <= tamColuna-1 && (tamColuna-1 != volta && tamLinha-1 != volta)? coluna - 1 : coluna;
    linha = coluna == tamColuna - 1 && linha<=tamLinha-1? linha + 1 : linha;
    coluna = coluna < tamColuna - 1 && linha == volta? coluna + 1 : coluna;
 */
