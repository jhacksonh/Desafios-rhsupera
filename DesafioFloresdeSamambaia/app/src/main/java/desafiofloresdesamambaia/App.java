package desafiofloresdesamambaia;

public class App {
    public static void main(String[] args){
        int r2 = 2, x2 = 0,y2=0;
        System.out.println("\n\n"+TentativaDesenhar(9, 0, 0,r2, x2, y2));
    }
    public static String TentativaDesenhar(int r1,int x1,int y1, /*-*/ int r2, int x2,int y2){
        //     distancia =  ✔(x2-x1)²+(y2-y1)²
        double distancia = Math.sqrt(Math.pow((x2-x1), 2)+Math.pow((y2-y1), 2));
        boolean condDesenho = r1>=distancia+r2;

        return condDesenho?"RICO":"MORTO";
    }
}
