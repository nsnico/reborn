//Nicolas Troncoso Pereira
package ejercicio8;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        int contador = 2;
        boolean primo=true;
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero positivo: "));
        String resultado = "no es primo";
        while ((primo) && (contador!=numero)){
            if (numero % contador == 0) primo = false;
            contador++;
        }
        if(primo) resultado = " es primo";
        JOptionPane.showMessageDialog(null, "el numero " + resultado );
    }
}
