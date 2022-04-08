//Nicolas Troncoso Pereira
package ejercicio7;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        int numero = -1;
        int resultado = 1;
        while(numero < 1){
            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero positivo: "));
        }
		while(numero>9){
            numero = numero / 10;
            resultado++;
        }
        JOptionPane.showMessageDialog(null, "numero de digitos es: " + resultado );
    }
}
