package case_study.model;

public class House extends Facility{
    private String roomStandard;
    private int NumberRoomHouse;

    public House() {
    }

    public House(String roomStandard, int numberRoomHouse) {
        this.roomStandard = roomStandard;
        NumberRoomHouse = numberRoomHouse;
    }

    public House(String name, int area, int price, int numberHumanMax, String rentalType, String roomStandard, int numberRoomHouse) {
        super(name, area, price, numberHumanMax, rentalType);
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
                ", name='" + name + '\'' +
                ", areaAll=" + areaAll +
                ", price=" + price +
                ", numberHumanMax=" + numberHumanMax +
                ", rentalType='" + rentalType + '\'' +
                '}';
    }
}
