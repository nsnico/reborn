import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("ingrese la altura: ");
        int altura = Integer.parseInt(entrada.nextLine());
        dibujarPiramida(altura);
        entrada.close();
    }

    private static void dibujarPiramida(int altura) {
        String escalera = "";
        String grada = "";
        int espacios = altura-1;
        for (int i = 0; i < altura; i++) {
            grada = generarGrada(i+1, i);
            grada = agregarEspacio(grada, espacios);
            escalera += grada+"\n";
            espacios--;
        }
        System.out.println(escalera);
    }
    private static String agregarEspacio(String grada, int espacios) {
        for (int i = 0; i < espacios; i++) {
            grada = " " + grada;
        }
        return grada;
    }

    private static String generarGrada(int ancho, int anchoExtra){
        String grada = "";
        for (int i = 0; i < ancho; i++) {
            grada += "*";
        }
        for(int j = 0 ; j<anchoExtra;j++){
            grada += "*";
        }
        return grada;
    }
}
