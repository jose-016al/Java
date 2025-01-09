class House {

    private int rooms;
    private String roofType;

    public House(int rooms, String roofType) {
        this.rooms = rooms;
        this.roofType = roofType;
    }

    public int getRooms() {
        return rooms;
    }

    public String getRoofType() {
        return roofType;
    }

    public void setRooms(int rooms) {
        this.rooms = rooms;
    }

    public void setRoofType(String roofType) {
        this.roofType = roofType;
    }

    @Override
    public String toString() {
        return "House{" +
                "rooms=" + rooms +
                ", roofType='" + roofType + '\'' +
                '}';
    }
}