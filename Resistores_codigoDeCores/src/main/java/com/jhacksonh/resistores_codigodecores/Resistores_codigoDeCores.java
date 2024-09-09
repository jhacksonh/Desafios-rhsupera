/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.jhacksonh.resistores_codigodecores;

/**
 *
 * @author Jhacksonhexit
 * 
 */
public class Resistores_codigoDeCores {

    public static void main(String[] args) {
        System.out.println("\n"+GetResistorColors("2m ohms"));
    }

    public static String GetResistorColors(String valorOhms) {
        String[] codColors = { "preto", "marrom", "vermelho", "laranja", "amarelo", "verde", "azul", "violeta", "cinza","branco" };

        Double ohms = Double.parseDouble(valorOhms.replaceAll("[^\\d.-]", ""));
        String dotRemoved = Integer.parseInt((""+ohms).split("\\.")[1]) != 0?(""+ohms):(""+ohms).split("\\.")[0];
        int number1 = Integer.parseInt(""+dotRemoved.charAt(0));
        int number2 = dotRemoved.length() > 1 ? Integer.parseInt(""+dotRemoved.charAt(1)):0;
        int number3 = dotRemoved.length() > 2?1:0;


        if(valorOhms.split(" ")[0].contains("k")){
            number3 = 2;
        }else if(valorOhms.split(" ")[0].contains("m")){
            number3 = 5;
        }
        ohms = Integer.parseInt((""+ohms).split("\\.")[1]) != 0?(ohms*10)*Math.pow(10, number3):ohms*Math.pow(10, number3);
        return String.format("%s, %s, %s e dourado",codColors[number1],codColors[number2],codColors[number3]);
    }
}
