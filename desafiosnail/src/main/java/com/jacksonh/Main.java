package com.jacksonh;

public class Main {
    public static void main(String[] args) {
        Caracol caracol = new Caracol();
        //variável valoresC cotém as matrizes que eu quero exibir => ela está gerando e pegando a matriz simultaniamente.
        int[][] valoresC = {
            caracol.PegarArray(caracol.Gerarmatriz(2, 2)),    
            caracol.PegarArray(caracol.Gerarmatriz(3, 2)),    
            caracol.PegarArray(caracol.Gerarmatriz(3, 3)),    
            caracol.PegarArray(caracol.Gerarmatriz(4, 2)), 
            caracol.PegarArray(caracol.Gerarmatriz(5, 5)),  
            caracol.PegarArray(caracol.Gerarmatriz(7, 5)),  
            caracol.PegarArray(caracol.Gerarmatriz(10, 10)),
            // caracol.PegarArray(caracol.Gerarmatriz(157, 132)),
        };
        for (int l = 0; l < valoresC.length; l++) {
            System.out.println("\n====================================================================================================================");
            for (int c = 0; c < valoresC[l].length; c++) {
                System.out.print(valoresC[l][c] + " | ");
            }
        }
        
    }
}