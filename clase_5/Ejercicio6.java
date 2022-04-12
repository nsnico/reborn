import javax.swing.JOptionPane;

public class Ejercicio6 {
    public static void main(String[] args) {
        int numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un numero "));
        String mensaje = "El numero no es Primo";
        if(esPrimo(numero))mensaje = "El numero es Primo";
        JOptionPane.showMessageDialog(null,mensaje);
    }
    public static boolean esPrimo(int numero){
        boolean primo = true;
        for(int i=2; (primo) && i!=numero;i++){
            if (numero % i == 0) primo = false;
        }
        return primo;
    }
}
