package clase4;

import javax.swing.JOptionPane;

public class Ejercicio4 {
    public static void main(String[] args) {
        String palabra1 = JOptionPane.showInputDialog("Ingrese una palabra: ");
        String palabra2 = JOptionPane.showInputDialog("Ingrese una palabra: ");
        boolean igual = palabra1.equals(palabra2);
        String respuesta = igual ? "las palabras son iguales" : "las palabras no son iguales";
        JOptionPane.showMessageDialog(null, respuesta);
    }
}
