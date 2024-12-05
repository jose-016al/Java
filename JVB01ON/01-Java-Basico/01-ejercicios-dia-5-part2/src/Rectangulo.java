public class Rectangulo extends FiguraGeometrica {

        // Variables
    private int lado1;
    private int lado2;

        // Constructor
    public Rectangulo(int id, String color, int coordenadas, int lado1, int lado2) {
        super(id, color, coordenadas);
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    @Override
    public double calcularArea() {
        return lado1 * lado2;
    }
}
