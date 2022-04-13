import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("ingrese un valor: ");
        double cantidad = Double.parseDouble(entrada.nextLine());

        System.out.println("ingrese el tipo de cambio:");
        System.out.println("libra");
        System.out.println("yen");
        System.out.println("dolar");
        String tipoCambio = entrada.nextLine();
        cambio(cantidad , tipoCambio);
        entrada.close();
    }

    private static void cambio(double cantidad, String tipoCambio) {
        double resultado = 0.0;
        if(tipoCambio.equals("libra")) resultado = cantidad * 0.86;
        if(tipoCambio.equals("yen")) resultado = cantidad * 1.28611;
        if(tipoCambio.equals("dolar")) resultado = cantidad * 129.852;
        System.out.println("el cambio es: " + resultado);
    }
}
