public class Main {
    public static void main(String[] args) {
        HouseBuilder normalHouseBuilder = new NormalHouseBuilder();
        HouseDirector normalHouseDirector = new HouseDirector(normalHouseBuilder);

        normalHouseDirector.constructHouse();
        House normalHouse = normalHouseDirector.getConstructedHouse();
        System.out.println("Casa normal: " + normalHouse);

        // Construcción de una casa de lujo
        HouseBuilder luxuryHouseBuilder = new LuxuryHouseBuilder();
        HouseDirector luxuryHouseDirector = new HouseDirector(luxuryHouseBuilder);

        luxuryHouseDirector.constructHouse();
        House luxuryHouse = luxuryHouseDirector.getConstructedHouse();
        System.out.println("Casa de lujo: " + luxuryHouse);

    }
}