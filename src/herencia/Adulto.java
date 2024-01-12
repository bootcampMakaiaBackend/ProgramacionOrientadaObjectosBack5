package herencia;

public class Adulto extends Persona {
    private String cedula;

    public Adulto(String nombre, String apellido, int estatura, int edad, String cedula) {
        super(nombre, apellido, estatura, edad);
        this.cedula = cedula;
    }

    public void pagar(){
         System.out.println("Pagando desde el adulto");
    }
}
