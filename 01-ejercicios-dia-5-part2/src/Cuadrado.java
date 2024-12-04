public class Cuadrado extends  FiguraGeometrica {

        // Variables
    private int lado;

        // Constructor
    public Cuadrado(int id, String color, int coordenadas, int lado) {
        super(id, color, coordenadas);
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return lado * lado;
    }
}
