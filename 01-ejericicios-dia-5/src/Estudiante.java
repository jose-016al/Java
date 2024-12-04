public class Estudiante {

        // Variables
    private int id;
    private String nombre;
    private double nota;

        // Cosntructor
    public Estudiante(int id, String nombre, double nota) {
        this.id = id;
        this.nombre = nombre;
        this.nota = nota;
    }

        // Getters methods
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public double getNota() {
        return nota;
    }

        // Setters methods
    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", nota=" + nota +
                '}';
    }
}
