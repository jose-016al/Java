public class Main {
    public static void main(String[] args) {

            // Objetos
        Perro miPerro = new Perro("Rocco", 3);
        Gato miGato = new Gato("Pelusa", 2);

        miPerro.comer();
        miPerro.ladrar();
        miGato.comer();
        miGato.maullar();

            // Polimorfismo
        miPerro.emitirSonido();
        miGato.emitirSonido();


    }
}
