//Nicolas Troncoso Pereira
import java.util.Random;
import javax.swing.JOptionPane;


public class Ejercicio2 {
    public static void main(String[] args) {
        int numeros = Integer.parseInt(JOptionPane.showInputDialog(null, "cantidad de numeros aleatorios"));
        int minimo = Integer.parseInt(JOptionPane.showInputDialog(null, "numero minimo"));
        int maximo = Integer.parseInt(JOptionPane.showInputDialog(null, "numero maximo"));
        String numerosGenerados = "";
        int numero= 0;
        for (int i = 0; i < numeros; i++) {
            numero = generarNumero(minimo, maximo);
            numerosGenerados += "," + numero;
        }
        JOptionPane.showMessageDialog(null, "Los numeros generados son: " + numerosGenerados.substring(1));
    }
    public static int generarNumero(int min, int max){
        int numero = 0;

		Random random = new Random();

		numero = random.nextInt(max + min) + min;
        return numero;
    }
}
