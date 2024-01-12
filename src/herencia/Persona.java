package herencia;

public class Persona {
    //modificador de acceso + tipo de dato + nombre del atributo
    protected String nombre;
    private String apellido;
    private int estatura;
    private int edad;
    //PROTECTED

    //como se crea un constructor.
    //public NombreClase (/... argumentos)
    public Persona(String nombre, String apellido, int estatura, int edad){
        this.nombre = nombre;
        this.apellido = apellido;
        this.estatura = estatura;
        this.edad = edad;
    }

    public void comer(){
        System.out.println("Persona esta comiendo");
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEstatura() {
        return estatura;
    }

    public int getEdad() {
        return edad;
    }
}
