package clase4;

public class Ejercicio8 {
    public static void main(String[] args) {
        enum Dias {
            lunes ("dia laboral"),
            martes ("dia laboral"),
            miercoles ("dia laboral"),
            jueves ("dia laboral"),
            viernes ("dia laboral"),
            sabado  ("no es dia laboral"),
            domingo ("no es dia laboral");
            
            private final String codigoDia;
            private Dias(String dia){
                this.codigoDia = dia;
            }
            public String toString() {return this.codigoDia;}
        };
        
        Dias dia;
        dia = Dias.valueOf("lunes");
        System.out.println(dia.toString());
    }
}
