import javax.swing.JOptionPane;

//Nicolas Troncoso Pereira
public class Ejercicio3 {
    public static void main(String[] args) {
        int numero = Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese numero"));
        String mensaje = esPrimo(numero) ? "es un numero primo": "no es un numero primo";
        JOptionPane.showMessageDialog(null, mensaje);
    }
    public static boolean esPrimo(int numero){
        boolean resultado=true;
        for (int i = 2; resultado && (i<=Math.sqrt(numero));i++){
            if (numero % i == 0) resultado = false;
        }
        return resultado;
    }
}
