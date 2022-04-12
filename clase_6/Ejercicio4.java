//Nicolas Troncoso Pereira
import javax.swing.JOptionPane;

public class Ejercicio4 {
    public static void main(String[] args) {
        int numero = Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese numero"));
        int numeroFactorial = factorial(numero) ;
        JOptionPane.showMessageDialog(null, "el numero factorial es:" + numeroFactorial);
    }
    public static int factorial(int numero){
        int resultado = 1;
        for (int i = numero; i > 0 ;i--){
            resultado *= i;
        }
        return resultado;
    }
}
