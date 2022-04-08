//Nicolas Troncoso Pereira
//ejercicio 1 y 2

package com.nico;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        int numero1 = 10;
        int numero2 = 20;

        // ejercicio 1
        ArrayList<Double> resultadoEjercicio1 = ejercicio1(numero1, numero2);
        resultadoEjercicio1.forEach(resultado -> System.out.println(resultado));

        // ejercicio 2
        System.out.println(ejercicio2(numero2, numero1));
    }
    public static ArrayList<Double> ejercicio1(int numero1, int numero2){
        ArrayList<Double> resultados = new ArrayList<Double>();
        resultados.add((double) numero2 - numero1);
        resultados.add((double) numero2 + numero1);
        resultados.add((double) numero2 / numero1);
        resultados.add((double) numero2 % numero1);
        return resultados;
    }
    public static String ejercicio2(int numero1, int numero2){
        if( numero2 > numero1) return  "numero2 "+ numero2 +" es mayor ";
        if( numero2 < numero1) return  "numero1 "+ numero1 +" es mayor ";
        return "los numeros son iguales";
    }
}
