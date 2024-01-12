package agregacion;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Libro> libros;

    public Biblioteca(){ //agregacion
        this.libros = new ArrayList<>(); // empty
    }

    public void agregarLibro(Libro libro){  //agregacion
        libros.add(libro);
    }

    public int obtenerTamanoBiblioteca(){
        return this.libros.size();
    }
}
