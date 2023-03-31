package case_study.model.facility;


public class House extends Facility {
    private String roomStandard;
    private int numberRoomHouse;

    public House() {
    }

    public House(String roomStandard, int numberRoomHouse) {
        this.roomStandard = roomStandard;
        this.numberRoomHouse = numberRoomHouse;
    }

    public House(String nameService, int area, int price, int numberHumanMax, String rentalType, String roomStandard, int numberRoomHouse) {
        super(nameService, area, price, numberHumanMax, rentalType);
        this.roomStandard = roomStandard;
        this.numberRoomHouse = numberRoomHouse;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public int getNumberRoomHouse() {
        return numberRoomHouse;
    }

    public void setNumberRoomHouse(int numberRoomHouse) {
        this.numberRoomHouse = numberRoomHouse;
    }

    @Override
    public String toString() {
        return "House{" +
                "roomStandard='" + roomStandard + '\'' +
                ", NumberRoomHouse=" + numberRoomHouse +
                ", name='" + nameService + '\'' +
                ", areaAll=" + areaAll +
                ", price=" + price +
                ", numberHumanMax=" + numberHumanMax +
                ", rentalType='" + rentalType + '\'' +
                '}';
    }

    public String getInfoToCSV() {
        return nameService + "," + areaAll + "," + price + "," + numberHumanMax + "," + rentalType + "," + roomStandard + "," + numberRoomHouse;
    }
}
