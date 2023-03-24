package case_study.model;

public class Villa extends Facility{
    private String roomStandard;
    private int areaPool;
    private int NumberRoomVilla;

    public Villa() {
    }

    public Villa(String roomStandard, int areaPool, int numberRoomVilla) {
        this.roomStandard = roomStandard;
        this.areaPool = areaPool;
        NumberRoomVilla = numberRoomVilla;
    }

    public Villa(String name, int area, int price, int numberHumanMax, String rentalType, String roomStandard, int areaPool, int numberRoomVilla) {
        super(name, area, price, numberHumanMax, rentalType);
        this.roomStandard = roomStandard;
        this.areaPool = areaPool;
        NumberRoomVilla = numberRoomVilla;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public int getAreaPool() {
        return areaPool;
    }

    public void setAreaPool(int areaPool) {
        this.areaPool = areaPool;
    }

    public int getNumberRoomVilla() {
        return NumberRoomVilla;
    }

    public void setNumberRoomVilla(int numberRoomVilla) {
        NumberRoomVilla = numberRoomVilla;
    }

    @Override
    public String toString() {
        return "Villa{" +
                "roomStandard='" + roomStandard + '\'' +
                ", areaPool=" + areaPool +
                ", NumberRoomVilla=" + NumberRoomVilla +
                ", name='" + name + '\'' +
                ", areaAll=" + areaAll +
                ", price=" + price +
                ", numberHumanMax=" + numberHumanMax +
                ", rentalType='" + rentalType + '\'' +
                '}';
    }
}
