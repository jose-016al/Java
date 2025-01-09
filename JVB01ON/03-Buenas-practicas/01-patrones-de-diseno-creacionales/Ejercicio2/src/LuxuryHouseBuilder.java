class LuxuryHouseBuilder implements HouseBuilder {
    private House house;

    public LuxuryHouseBuilder() {
        this.house = new House(0, "Luxury");
    }

    @Override
    public void buildRooms() {
        house = new House(6, house.getRoofType()); // Una casa de lujo suele tener 6 habitaciones
    }

    @Override
    public void buildRoof() {
        house = new House(house.getRooms(), "Luxury Roof"); // Puede personalizar el tipo de techo de una casa de lujo
    }

    @Override
    public House getResult() {
        return house;
    }
}
