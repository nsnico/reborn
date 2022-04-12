import javax.swing.JOptionPane;

//Nicolas Troncoso Pereira

public class Ejercicio1 {

    public static void main(String[] args) {
        String[] buttons = { "Cirulo", "Cuadrado", "Triangulo" };
        int opcion = JOptionPane.showOptionDialog(null, "Seleccione una opcion: ", "Seleccione una opcion",
        JOptionPane.INFORMATION_MESSAGE, 0, null, buttons, buttons[2]);
        switch (opcion) {
            case 0:
                int radio = Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese un valor: "));
                JOptionPane.showMessageDialog(null, areaCirculo(radio));
                break;
            case 1:
                int lado = Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese un valor: "));
                JOptionPane.showMessageDialog(null, areaCuadrado(lado));
                break;
            default:
                
                int base = Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese un valor: "));
                int altura = Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese un valor: "));
                JOptionPane.showMessageDialog(null, areaTriangulo(base, altura));
                break;
        }
    }
    public static double areaCirculo(int radio){
        double resultado = 0.0;
        resultado = Math.PI*Math.pow(radio, 2);
        return resultado;
    }
    public static double areaCuadrado(int lado){
        double resultado = 0.0;
        resultado = lado * lado;
        return resultado;
    }
    public static double areaTriangulo(int base, int altura){
        double resultado = 0.0;
        resultado = (base*altura)/2;
        return resultado;
    }
}