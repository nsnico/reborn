package clase4;

import java.util.Scanner;

public class Ejercicio210 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String frase = entrada.nextLine();
        String letraAReemplazar = entrada.nextLine();
        String letraNueva = entrada.nextLine();
        
        char letraReemplazada = letraAReemplazar.charAt(0);
        char reemplazarLetra = letraNueva.charAt(0);
        String cadena = "hola mundo";
        if(!frase.isEmpty()) cadena = frase;
        String respuesta = "";
        for(int i = 0; i<cadena.length(); i++){
            char c = cadena.charAt(i);
            if( c == letraReemplazada){
                respuesta += reemplazarLetra;
            }else{
                respuesta += c;
            }
        }
        System.out.println(respuesta);
        entrada.close();
    }
}
