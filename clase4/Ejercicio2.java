package clase4;

import javax.swing.JOptionPane;

public class Ejercicio2 {
    public static void main(String[] args) {
        String opciones[] = {"Mayusculas", "Minusculas"};
        String frase = "Hola mundO";
        int opcion = JOptionPane.showOptionDialog(null, "mayusculas o minusculas?", "Opciones",JOptionPane.INFORMATION_MESSAGE, 0, null, opciones, opciones[1]);
        String respuesta = "";
        switch (opcion) {
            case 0:
                respuesta = frase.toUpperCase();
                break;
        
            default:
                respuesta = frase.toLowerCase();
                break;
        }
        JOptionPane.showMessageDialog(null, respuesta);
    }
}
