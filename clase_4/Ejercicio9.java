package clase4;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Ejercicio9 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        int numero=0;
        numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un numero "));
        while(numero !=-1){
            numeros.add(numero);
            numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un numero "));
        }
        int numeroMayor= Integer.MIN_VALUE;
        int numeroMenor = Integer.MAX_VALUE;
        int suma = 0;
        int sumaPositivos = 0;
        int sumaNegativos = 0;
        int media = 0;

        for(int n:numeros){
            if(numeroMayor<n)numeroMayor=n;
            if(numeroMenor>n)numeroMenor=n;
            suma += n;
            if(n>0) sumaPositivos+=n;
            if(n<0) sumaNegativos-=n;
        }
        media = suma/numeros.size();
        JOptionPane.showMessageDialog(null,"numero mayor: " + numeroMayor);
        JOptionPane.showMessageDialog(null,"numero menor: " + numeroMenor);
        JOptionPane.showMessageDialog(null,"la suma: " + suma);
        JOptionPane.showMessageDialog(null,"suma positivos: " + sumaPositivos);
        JOptionPane.showMessageDialog(null,"suma negativos: " + sumaNegativos);
        JOptionPane.showMessageDialog(null,"media: " + media);
    }
}
