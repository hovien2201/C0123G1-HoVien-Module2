package case_study.model.facility;


public class Villa extends Facility {
    private String roomStandard;
    private int areaPool;
    private int numberRoomVilla;

    public Villa() {
    }

    public Villa(String roomStandard, int areaPool, int numberRoomVilla) {
        this.roomStandard = roomStandard;
        this.areaPool = areaPool;
        this.numberRoomVilla = numberRoomVilla;
    }

    public Villa(String nameService, int area, int price, int numberHumanMax, String rentalType, String roomStandard, int areaPool, int numberRoomVilla) {
        super(nameService, area, price, numberHumanMax, rentalType);
        this.roomStandard = roomStandard;
        this.areaPool = areaPool;
        this.numberRoomVilla = numberRoomVilla;
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
        return numberRoomVilla;
    }

    public void setNumberRoomVilla(int numberRoomVilla) {
        this.numberRoomVilla = numberRoomVilla;
    }

    @Override
    public String toString() {
        return "Villa{" +
                "roomStandard='" + roomStandard + '\'' +
                ", areaPool=" + areaPool +
                ", NumberRoomVilla=" + numberRoomVilla +
                ", name='" + nameService + '\'' +
                ", areaAll=" + areaAll +
                ", price=" + price +
                ", numberHumanMax=" + numberHumanMax +
                ", rentalType='" + rentalType + '\'' +
                '}';
    }
    public String getInfoToCSV() {
        return nameService + "," + areaAll + "," + price + "," + numberHumanMax + "," + rentalType + "," + roomStandard + "," +areaPool + "," +numberRoomVilla ;
    }
}
