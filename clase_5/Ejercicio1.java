//Nicolas Troncoso Pereira

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("ingrese un numero: ");
        int numero = Integer.parseInt(entrada.nextLine());
        int resultado = factorial(numero);
        System.out.println(resultado);
        entrada.close();
    }
    public static int factorial(int numero){
        int resultado = 1;
		for(int i=1; i<=numero; i++){
            resultado *= i;
        }
        return resultado;
    }
}