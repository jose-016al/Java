class HouseDirector {
    private HouseBuilder houseBuilder;

    public HouseDirector(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    public void constructHouse() {
        houseBuilder.buildRooms();
        houseBuilder.buildRoof();
    }

    public House getConstructedHouse() {
        return houseBuilder.getResult();
    }
}
