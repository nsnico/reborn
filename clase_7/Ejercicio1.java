import java.util.Scanner;

//Nicolas Troncoso Pereira


public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("ingrese un valor: ");
        int numero = Integer.parseInt(entrada.nextLine());
        int cifras = numeroCifras(numero);
        System.out.println(cifras);
        entrada.close();
    }
    public static int numeroCifras(int numero){
        int cifras = 0;
        while(numero > 0){
            cifras += 1;
            numero /= 10;
        }
        return cifras;
    }
}
