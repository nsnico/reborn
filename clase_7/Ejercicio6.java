import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("ingrese la altura: ");
        int altura = Integer.parseInt(entrada.nextLine());
        dibujarEscalera(altura);
        entrada.close();
    }

    private static void dibujarEscalera(int altura) {
        String escalera = "";
        String grada = "";
        for (int i = 0; i < altura; i++) {
            grada =generarGrada(i+1);
            escalera += grada+"\n";
        }
        System.out.println(escalera);
    }
    private static String generarGrada(int ancho){
        String grada = "";
        for (int i = 0; i < ancho; i++) {
            grada += i+1 +"";
        }
        return grada;
    }
}
