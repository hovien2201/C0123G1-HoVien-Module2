package case_study.model.facility;


public class House extends Facility {
    private String roomStandard;
    private String numberOfFloors;

    public House() {
    }

    public House(String roomStandard, String numberOfFloors) {
        this.roomStandard = roomStandard;
        this.numberOfFloors = numberOfFloors;
    }

    public House(String id, String nameService, String areaAll, String price, String numberHumanMax, String rentalType, String roomStandard, String numberOfFloors) {
        super(id, nameService, areaAll, price, numberHumanMax, rentalType);
        this.roomStandard = roomStandard;
        this.numberOfFloors = numberOfFloors;
    }


    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public String getNumberRoomHouse() {
        return numberOfFloors;
    }

    public void setNumberRoomHouse(String numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public String toString() {
        return "House{" +
                ", id='" + id + '\'' +
                ", nameService='" + nameService + '\'' +
                ", areaAll=" + areaAll +
                ", price=" + price +
                ", numberHumanMax=" + numberHumanMax +
                ", rentalType='" + rentalType + '\'' +
                ", roomStandard='" + roomStandard + '\'' +
                ", numberOfFloors=" + numberOfFloors +
                '}';
    }

    @Override
    public String getInfoToCSV() {
        return id + "," + nameService + "," + areaAll + "," + price + "," + numberHumanMax + "," + rentalType + "," + roomStandard + "," + numberOfFloors;
    }
}
