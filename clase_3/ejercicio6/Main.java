//Nicolas Troncoso Pereira
package ejercicio6;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        int minimo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el minimo: "));
        int maximo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el maximo: "));
		int resultado = (int) (Math.random()*(maximo-minimo)) + minimo;
        JOptionPane.showMessageDialog(null, "el numero es " + resultado );
    }
}
