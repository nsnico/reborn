//Nicolas Troncoso Pereira

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("ingrese un numero: ");
        int numero1 = Integer.parseInt(entrada.nextLine());
        System.out.println("ingrese un numero: ");
        int numero2 = Integer.parseInt(entrada.nextLine());
        String mensaje = esMayor(numero1, numero2);
        System.out.println(mensaje);
        entrada.close();
    }
    public static String esMayor(int numero1, int numero2){
        if (numero1 == numero2) return "Los numeros son iguales";
        if (numero1 > numero2) return "el numero " + numero1 + " es mayor al numero " + numero2;
        return "el numero " + numero2 + " es mayor al numero " + numero1;
    }
}
