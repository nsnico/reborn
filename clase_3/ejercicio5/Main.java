//Nicolas Troncoso Pereira
package ejercicio5;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        String dia = JOptionPane.showInputDialog("Ingrese un dia: ");
        String resultado;
        switch (dia) {
            case "sabado":
                resultado="no laborable";
                break;
            case "domingo":
                resultado="no laborable";
                break;
            default:
                resultado="laborable";
                break;
        }
        JOptionPane.showMessageDialog(null, "es un dia " + resultado );
    }
}
