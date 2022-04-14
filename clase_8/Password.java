//Nicolas Troncoso Pereira
package Ejercicio3;

import java.util.Random;

public class Password {
    private int longitud;
    private String contraseña;

    public Password(){
        this.longitud = 8;
        this.contraseña = this.generarPassword();
    }
    public Password(int longitud){
        this.longitud = longitud;
        this.contraseña = this.generarPassword();
    }
    public boolean esFuerte(){
        boolean respuesta = false;
        int mayusculas = 0;
        int minusculas = 0;
        int numeros = 0;

        for (int i = 0; i < this.longitud; i++) {
            if(Character.isUpperCase(this.contraseña.charAt(i))) mayusculas++;
            if(Character.isLowerCase(this.contraseña.charAt(i))) minusculas++;
            if(this.contraseña.charAt(i) >= 48 && this.contraseña.charAt(i) <= 57) numeros++;
        }
        if(mayusculas > 2 && minusculas > 1 && numeros > 5) respuesta = true;
        return respuesta;
    }
    public String generarPassword(){
        String password = "";
        Random numeroAleatorio = new Random();
        String caracteres = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        int indice;
        for (int i = 0; i < longitud; i++) {
            indice = numeroAleatorio.nextInt(caracteres.length());
            char caracter = caracteres.charAt(indice);
            password += caracter;
        }
        return password;
    }
    public String getContraseña() {
        return contraseña;
    }
    public int getLongitud() {
        return longitud;
    }
    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }
}
