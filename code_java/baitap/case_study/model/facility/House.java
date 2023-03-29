package case_study.model.facility;


public class House extends Facility {
    private String roomStandard;
    private int NumberRoomHouse;

    public House() {
    }

    public House(String roomStandard, int numberRoomHouse) {
        this.roomStandard = roomStandard;
        NumberRoomHouse = numberRoomHouse;
    }

    public House(String nameService, int area, int price, int numberHumanMax, String rentalType, String roomStandard, int numberRoomHouse) {
        super(nameService, area, price, numberHumanMax, rentalType);
        this.roomStandard = roomStandard;
        NumberRoomHouse = numberRoomHouse;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public int getNumberRoomHouse() {
        return NumberRoomHouse;
    }

    public void setNumberRoomHouse(int numberRoomHouse) {
        NumberRoomHouse = numberRoomHouse;
    }

    @Override
    public String toString() {
        return "House{" +
                "roomStandard='" + roomStandard + '\'' +
                ", NumberRoomHouse=" + NumberRoomHouse +
                ", name='" + nameService + '\'' +
                ", areaAll=" + areaAll +
                ", price=" + price +
                ", numberHumanMax=" + numberHumanMax +
                ", rentalType='" + rentalType + '\'' +
                '}';
    }
}
