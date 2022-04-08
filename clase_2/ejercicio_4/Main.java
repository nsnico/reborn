import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        String nombre = "Nicolas Troncoso Pereira";
        String nombreNuevo = JOptionPane.showInputDialog("Ingrese su nombre: ");
        if(nombreNuevo.length() > 0) nombre = nombreNuevo;
        JOptionPane.showMessageDialog(null, "Bienvenido " + nombre);
    }
}
