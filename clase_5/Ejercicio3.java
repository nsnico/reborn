//Nicolas Troncoso Pereira

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("ingrese un numero: ");
        int numero = Integer.parseInt(entrada.nextLine());
        String esPar = numeroEsPar(numero);
        String esPositivo = numeroEsPositivo(numero);
        System.out.println(esPar);
        System.out.println(esPositivo);
        entrada.close();
    }
    public static String numeroEsPar(int numero){
        if (numero%2 == 0) return "el numero es par";
        return "el numero es impar";
    }
    public static String numeroEsPositivo(int numero){
        if (numero <0) return "el numero es negativo";
        return "el numero es positivo";
    }
}
