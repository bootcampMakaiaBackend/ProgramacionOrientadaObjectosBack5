package agregacion;

public class Libro {
    private String titulo;
    private String autor;
    private int anoPublicacion;

    //Multiples constructores
    public Libro(String titulo, String autor, int anoPublicacion){
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacion = anoPublicacion;
    }

    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getTitulo(){
        return this.titulo;
    }

    public String getAutor() {
        return this.autor;
    }

    public int getAnoPublicacion() {
        return this.anoPublicacion;
    }
}
