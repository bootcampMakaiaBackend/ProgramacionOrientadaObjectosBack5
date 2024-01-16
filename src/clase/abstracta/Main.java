package clase.abstracta;

public class Main {
    public static void main(String[] args) {

        // forma de instanciar
        Cuadrado cuadrado = new Cuadrado(2, "cuadrado");
        Triangulo triangulo = new Triangulo(2,3, "triangulo");

        triangulo.mostrarInformacion();
        cuadrado.mostrarInformacion();

        //cosas genericas
        Figura cuadradoNuevo = new Cuadrado(2, "cuadrado");
        Figura trianguloNuevo = new Triangulo(2,5,"triangulo");
    }
}
