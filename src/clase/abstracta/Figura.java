package clase.abstracta;

public abstract class Figura {
    //atributos
    //metodos implementados
    //metodos no implementados ( abstractos )
    private String tipo;

    public Figura(String tipoFigura){
        this.tipo = tipoFigura;
    }

    public void mostrarInformacion(){
        System.out.println("El tipo de figura es : " + tipo
                + "y el area es : " + calcularArea());
    }

    public abstract double calcularArea(); // la definicion del metodo

}
