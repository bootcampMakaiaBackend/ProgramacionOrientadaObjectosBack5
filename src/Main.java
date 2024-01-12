import agregacion.Biblioteca;
import agregacion.Libro;

public class Main {
    public static void main(String[] args) {
        //Tipo  , nombre, = new Constructor
        Biblioteca bibliotecaPiloto = new Biblioteca(); //
        Libro juanaArco = new Libro("Juana de arco", "ana");
        bibliotecaPiloto.agregarLibro(juanaArco);
        Libro castillo = new Libro("Castillo de hola", "hola", 2010);
        bibliotecaPiloto.agregarLibro(castillo);
        System.out.println(bibliotecaPiloto.obtenerTamanoBiblioteca());
    }
}