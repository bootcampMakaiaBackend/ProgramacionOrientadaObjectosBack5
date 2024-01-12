package herencia;

public class Nino extends Persona {
    private String tarjetaIdentidad;

    public Nino(String nombre, String apellido, int estatura, int edad, String tarjetaIdentidad) {
        super(nombre, apellido, estatura, edad);
        this.tarjetaIdentidad = tarjetaIdentidad;
    }

    public void reir(){
        String apellido = getApellido();
        String nombrePersona = this.nombre;
        System.out.println("El nino se esta riendo con el nombre" + nombre);
    }

    @Override
    public void comer() {
        System.out.println("el nino esta comiendo");
    }
}
