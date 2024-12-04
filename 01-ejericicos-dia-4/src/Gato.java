class Gato extends Animal {

        // Constructor
    public Gato(String nombre, int edad) {
        super(nombre, edad);
    }

    public void maullar() {
        System.out.println(nombre + " está maullando.");
    }

    @Override
    public void emitirSonido() {
        System.out.println("Miauuuuuu");
    }
}