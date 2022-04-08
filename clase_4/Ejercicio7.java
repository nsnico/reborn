package clase4;

public class Ejercicio7 {
    public static void main(String[] args) {
        enum Dias {lunes, martes, miercoles, jueves, viernes, sabado, domingo};
        Dias dia;
        dia = Dias.valueOf("sabado");
        String respuesta = "";
        switch (dia) {
            case sabado:
            case domingo:
                respuesta = "no es dia laboral";
                break;
            default:
                respuesta = "es dia laboral";
                break;
        }
        System.out.println(respuesta);
    }
}
