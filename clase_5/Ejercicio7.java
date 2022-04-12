import java.util.Arrays;

import javax.swing.JOptionPane;

public class Ejercicio7 {
    public static void main(String[] args) {
        int numeros[] = new int[5];
        for (int i = 0; i < 5; i++) {
            numeros[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un numero "));
        }
        mostrar(numeros);
        JOptionPane.showMessageDialog(null, "la suma de los numeros es: " + suma(numeros));
        JOptionPane.showMessageDialog(null, "el orden inverso es: " + inverso(numeros));
    }
    public static int[] inverso(int[] numeros){
        int inverso[] = new int[5];
        int indiceInverso = 4;
        for (int i = 0; i < inverso.length; i++) {
            inverso[indiceInverso] = numeros[i];
        }
        return inverso;
    }
    public static int suma(int[] numeros){
        int resultado = 0;
        for (int i = 0; i < numeros.length; i++) {
            resultado+=numeros[i];
        }
        return resultado;
    }
    public static void mostrar(int[] numeros){
        String numerosConcatenados = ""+numeros[0];
        for(int i=1; i< numeros.length;i++){
            numerosConcatenados += ","+numeros[i];
        }
        JOptionPane.showMessageDialog(null, "los numeros son: " + numerosConcatenados );
    }
}
