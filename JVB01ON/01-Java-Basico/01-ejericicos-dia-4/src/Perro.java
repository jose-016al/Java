public class Perro extends Animal {

        // Constructor
    public Perro(String nombre, int edad) {
        super(nombre, edad);
    }

    public void ladrar() {
        System.out.println(nombre + " está ladrando.");
    }

    @Override
    public void emitirSonido() {
        System.out.println("Guauu Guauu");
    }


}
