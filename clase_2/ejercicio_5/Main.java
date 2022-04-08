//Nicolas Troncoso Pereira
//ejercicio 5
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        double radio = 0.0;
        String radioNuevo = JOptionPane.showInputDialog("Ingrese el radio del circulo: ");
        if(radioNuevo.length() > 0) radio = Double.parseDouble(radioNuevo);
        double areaCirculo = calcularArea(radio);
        JOptionPane.showMessageDialog(null, "El area del circulo " + areaCirculo);
    }
    public static double calcularArea(double radio){
        return Math.PI*Math.pow(radio, 2);
    }
}
