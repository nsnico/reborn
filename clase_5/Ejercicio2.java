//Nicolas Troncoso Pereira

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("ingrese un numero: ");
        int numero = Integer.parseInt(entrada.nextLine());
        int resultados[] = suma(numero);
        System.out.println("suma de los numeros pares: " + resultados[0]);
        System.out.println("suma de los numeros impares: " + resultados[1]);
        entrada.close();
    }
    public static int[] suma(int numero){
        int resultados[] = new int[2];
        resultados[0]=0;
        resultados[1]=0;
        for(int i = 1; i<=numero; i++){
            if(i%2 ==0){
                resultados[0]+=i;
            }else{
                resultados[1]+=i;
            }
        }
        return resultados;
    }
}
