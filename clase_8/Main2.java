//Nicolas Troncoso Pereira
package Ejercicio2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nombre = entrada.nextLine();
        int edad = Integer.parseInt(entrada.nextLine());
        char sexo = entrada.nextLine().charAt(0);
        double peso = Double.parseDouble(entrada.nextLine());
        double altura = Double.parseDouble(entrada.nextLine());
        Persona persona1 = new Persona(nombre, edad, sexo, peso, altura);
        Persona persona2 = new Persona(nombre, edad, sexo);
        Persona persona3 = new Persona();
        persona3.setNombre(nombre);
        persona3.setEdad(edad);
        persona3.setSexo(sexo);
        persona3.setPeso(peso);
        persona3.setAltura(altura);
        String mensaje = "";
        if(persona1.calcularIMC()==0)mensaje = "ideal";
        if(persona1.calcularIMC()==1)mensaje = "sobre peso";
        if(persona1.calcularIMC()==-1)mensaje = "poco peso";
        if(persona2.calcularIMC()==0)mensaje = "ideal";
        if(persona2.calcularIMC()==1)mensaje = "sobre peso";
        if(persona2.calcularIMC()==-1)mensaje = "poco peso";
        if(persona3.calcularIMC()==0)mensaje = "ideal";
        if(persona3.calcularIMC()==1)mensaje = "sobre peso";
        if(persona3.calcularIMC()==-1)mensaje = "poco peso";

        System.out.println("persona 1 su peso es: " + mensaje);
        System.out.println("persona 2 su peso es: " + mensaje );
        System.out.println("persona 3 su peso es: " + mensaje );

        mensaje = persona1.esMayorDeEdad()? "es mayor de edad" : "es menor de edad";
        System.out.println("persona 1 "+ mensaje );
        mensaje = persona2.esMayorDeEdad()? "es mayor de edad" : "es menor de edad";
        System.out.println("persona 2 "+ mensaje );
        mensaje = persona3.esMayorDeEdad()? "es mayor de edad" : "es menor de edad";
        System.out.println("persona 3 "+ mensaje );

        entrada.close();
    }
    
}
