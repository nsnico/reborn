//Nicolas Troncoso Pereira
package ejercicio4;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        int a = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el coeficiente a: "));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el coeficiente b: "));
        int c = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el coeficiente c: "));
        double discriminante = Math.sqrt(Math.pow(b, 2)-4*a*c);
        System.out.println(discriminante);
        double resultado1 = 0.0;
        double resultado2 = 0.0;
        resultado1 = (-b + discriminante)/(2*a);
        resultado2 = (-b - discriminante)/(2*a);
        JOptionPane.showMessageDialog(null, "resultado 1 " + resultado1);
        JOptionPane.showMessageDialog(null, "resultado 2 " + resultado2);
    }
}
