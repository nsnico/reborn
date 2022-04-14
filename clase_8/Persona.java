//Nicolas Troncoso Pereira
package Ejercicio2;

public class Persona {
    static final char sexoHombre = 'H';
    static final char sexoMujer = 'M';
    private String nombre;
    private int edad;
    private int DNI;
    private char sexo;
    private double peso;
    private double altura;

    public Persona(){
        this.nombre="";
        this.edad = 0;
        this.sexo = sexoHombre;
        this.peso = 0.0;
        this.altura = 0.0;
        this.DNI = this.generaDNI();
    }
    public Persona(String nombre, int edad, char sexo){
        this.nombre=nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = 0.0;
        this.altura = 0.0;
        this.DNI = this.generaDNI();
    }
    public Persona(String nombre, int edad, char sexo, double peso, double altura){
        this.nombre=nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
        this.DNI = this.generaDNI();
    }
    public double calcularIMC(){
        double respuesta = 0.0;
        respuesta = this.peso/Math.pow(this.altura, 2);
        if(respuesta<20)return -1;
        if(20>=respuesta&&respuesta<=25)return 0;
        return 1;
    }
    public boolean esMayorDeEdad(){
        boolean esMayor = false;
        if(this.edad>=18)esMayor=true;
        return esMayor;
    }
    private char comprobarSexo(char sexo){
        char respuesta = sexoHombre;
        if(this.sexo == sexo) respuesta = sexoMujer;
        return respuesta;
    } 
    public String toString(){
        return "" + this.nombre + this.edad + this.sexo + this.peso + this.altura;
    }
    private int generaDNI(){
        double digitos =  10000000 + Math.random() * 90000000;
        return (int) digitos;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
    public double getAltura() {
        return altura;
    }
    public int getEdad() {
        return edad;
    }
    public String getNombre() {
        return nombre;
    }
    public double getPeso() {
        return peso;
    }
    public char getSexo() {
        return sexo;
    }
}
