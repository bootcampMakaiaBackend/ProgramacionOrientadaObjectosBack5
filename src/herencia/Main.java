package herencia;

import agregacion.Biblioteca;
import agregacion.Libro;

public class Main {
    public static void main(String[] args) {
        Nino juan = new Nino("juan", "casas", 18, 6, "12312");
        juan.comer();
        Adulto ana = new Adulto("Ana", "espitia", 123, 21, "cc123");
        ana.comer();
        juan.reir();
    }
}
