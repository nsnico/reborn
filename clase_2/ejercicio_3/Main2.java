//Nicolas Troncoso Pereira
//ejercicio 3
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        String nombre = "Nicolas Troncoso Pereira";
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese su nombre: ");
        String nombreNuevo = entrada.nextLine();
        if(nombreNuevo.length() > 0) nombre = nombreNuevo;
        System.out.println("Bienvenido " + nombre);
    }
}
