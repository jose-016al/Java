public class Animal {

        // Variables
    String nombre;
    int edad;

        // Constructor
    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void comer() {
        System.out.println(nombre + " está comiendo.");
    }

    public void emitirSonido() {
        System.out.println("El animal hace un sonido genérico.");
    }
}
