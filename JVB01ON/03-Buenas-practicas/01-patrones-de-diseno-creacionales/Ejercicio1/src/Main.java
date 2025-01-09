public class Main {
    public static void main(String[] args) {

        // Utilizando ModernFurnitureFactory (muebles modernos)
        FurnitureFactory modernFactory = new ModernFurnitureFactory();
        Chair modernChair = modernFactory.createChair();
        Table modernTable = modernFactory.createTable();

        modernChair.sitOn(); // Imprime "Sentándose en una silla moderna"
        modernTable.putOn(); // Imprime "Colocando objetos en una mesa moderna"

        // Utilizando ClassicFurnitureFactory (muebles clásicos)
        FurnitureFactory classicFactory = new ClassicFurnitureFactory();
        Chair classicChair = classicFactory.createChair();
        Table classicTable = classicFactory.createTable();

        classicChair.sitOn(); // Imprime "Sentándose en una silla clásica"
        classicTable.putOn(); // Imprime "Colocando objetos en una mesa clásica"


    }
}