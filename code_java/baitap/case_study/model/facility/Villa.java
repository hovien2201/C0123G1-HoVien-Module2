package case_study.model.facility;


public class Villa extends Facility {
    private String roomStandard;
    private String areaPool;
    private String numberOfFloors;

    public Villa() {
    }

    public Villa(String roomStandard, String areaPool, String numberRoomVilla) {
        this.roomStandard = roomStandard;
        this.areaPool = areaPool;
        this.numberOfFloors = numberRoomVilla;
    }

    public Villa(String id, String nameService, String areaAll, String price, String numberHumanMax, String rentalType, String roomStandard, String areaPool, String numberOfFloors) {
        super(id, nameService, areaAll, price, numberHumanMax, rentalType);
        this.roomStandard = roomStandard;
        this.areaPool = areaPool;
        this.numberOfFloors = numberOfFloors;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public String getAreaPool() {
        return areaPool;
    }

    public void setAreaPool(String areaPool) {
        this.areaPool = areaPool;
    }

    public String getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(String numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public String toString() {
        return "Villa{" +
                ", id='" + id + '\'' +
                ", nameService='" + nameService + '\'' +
                ", areaAll=" + areaAll +
                ", price=" + price +
                ", numberHumanMax=" + numberHumanMax +
                ", rentalType='" + rentalType + '\'' +
                ", roomStandard='" + roomStandard + '\'' +
                ", areaPool=" + areaPool +
                ", numberOfFloors=" + numberOfFloors +
                '}';
    }

    @Override
    public String getInfoToCSV() {
        return id + "," + nameService + "," + areaAll + "," + price + "," + numberHumanMax + "," + rentalType + "," + roomStandard + "," + areaPool + "," + numberOfFloors;
    }
}
