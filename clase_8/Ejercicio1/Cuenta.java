//Nicolas Troncoso Pereira

package Ejercicio1;

public class Cuenta {

    private String titular;
    private double cantidad;

    public Cuenta(String titular){
        this.titular = titular;
        cantidad = 0.0;
    }
    public Cuenta(String titular, double cantidad){
        this.titular = titular;
        this.cantidad = cantidad;
    }
    public String toString(){
        return "El titular " + this.titular + " tiene " + cantidad;
    }
    public void setTitular(String nuevoTitular){
        this.titular = nuevoTitular;
    }
    public void setCantidad(double nuevaCantidad){
        this.cantidad = nuevaCantidad;
    }
    public String getTitular(){
        return this.titular;
    }
    public double getCantidad(){
        return this.cantidad;
    }

    public void ingresar(double cantidad){
        if(0>cantidad)this.cantidad+=cantidad;
    }

    public void retirar(double cantidad){
        this.cantidad = this.cantidad-cantidad;
        if(this.cantidad <= 0) this.cantidad=0;
    }
}
