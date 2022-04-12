//Nicolas Troncoso Pereira

import javax.swing.JOptionPane;

public class Ejercicio5 {
    public static void main(String[] args) {
        int numero1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un numero "));
        int numero2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un numero "));
        int resultado = numero1+numero2;
        JOptionPane.showMessageDialog(null,"la suma es: " + resultado);
    }
}
