public abstract class FiguraGeometrica {

        // Variables
    private int id;
    private String color;
    private int coordenadas;

        // Constructor
    public FiguraGeometrica(int id, String color, int coordenadas) {
        this.id = id;
        this.color = color;
        this.coordenadas = coordenadas;
    }

    public int getId() {
        return id;
    }

    public String getColor() {
        return color;
    }

    public int getCoordenadas() {
        return coordenadas;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setCoordenadas(int coordenadas) {
        this.coordenadas = coordenadas;
    }

    public abstract double calcularArea();
}
