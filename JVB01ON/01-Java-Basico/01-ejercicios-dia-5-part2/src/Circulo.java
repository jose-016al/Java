public class Circulo extends FiguraGeometrica {

        // Variables
    private int radio;

        // Constructor
    public Circulo(int id, String color, int coordenadas, int radio) {
        super(id, color, coordenadas);
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }
}
