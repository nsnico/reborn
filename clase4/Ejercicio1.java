package clase4;

import java.util.Scanner;

/**
 * Ejercicio1
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String frase = entrada.nextLine();
        String fraseSinEspacios = eliminarEspacios(frase);
        System.out.println(fraseSinEspacios);
        entrada.close();
    }
    public static String eliminarEspacios(String frase){
        String palabras[] = frase.split(" ");
        String nuevaFrase = String.join("", palabras);
        return nuevaFrase;
    }
}