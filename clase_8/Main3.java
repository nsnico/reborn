package Ejercicio3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int cantidadPasswords = Integer.parseInt(entrada.nextLine());
        int longitudPassword = Integer.parseInt(entrada.nextLine());

        Password passwords[] = new Password[cantidadPasswords];
        boolean passwordFuertes[] = new boolean[cantidadPasswords];

        for (int i = 0; i < cantidadPasswords; i++) {
            passwords[i]= new Password(longitudPassword);
        }
        for (int i = 0; i < cantidadPasswords; i++) {
            passwordFuertes[i] = passwords[i].esFuerte();
        }
        for (int i = 0; i < cantidadPasswords; i++) {
            System.out.println("contraseña " + (i+1) +  " " + passwords[i].getContraseña() + " " +passwordFuertes[i] );
        }

        entrada.close();
    }
}
