import javax.swing.JOptionPane;

//Nicolas Troncoso Pereira

public class Ejercicio5 {
    public static void main(String[] args) {
        int numero = Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese numero"));
        String numeroBinario = aBinario(numero) ;
        JOptionPane.showMessageDialog(null, "el numero binario es:" + numeroBinario);
    }
    public static String aBinario(int numero){
        String resultado = "";
        int residuo;
        while(numero > 1){
            residuo = numero % 2;
            numero /= 2;
            resultado = residuo+resultado;
        }
        resultado = numero + resultado;
        return resultado;
    }
}
