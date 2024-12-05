import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Crear el ArrayList de tipo FiguraGeometrica
        ArrayList<FiguraGeometrica> figuras = new ArrayList<>();

        // Crear objetos de diferentes tipos de figuras geométricas
        Circulo circulo = new Circulo(1, "Rojo", 0, 5);
        Rectangulo rectangulo = new Rectangulo(2, "Azul", 1, 4, 6);
        Cuadrado cuadrado = new Cuadrado(3, "Verde", 2, 4);

        // Añadir las figuras al ArrayList
        figuras.add(circulo);
        figuras.add(rectangulo);
        figuras.add(cuadrado);

        // Recorrer el ArrayList y mostrar la información de cada figura
        for (FiguraGeometrica figura : figuras) {
            // Mostrar la información de la figura
            System.out.println(figura);
            // Calcular y mostrar el área de la figura
            System.out.println("Área de la figura: " + figura.calcularArea());
            System.out.println();
        }
    }
}
