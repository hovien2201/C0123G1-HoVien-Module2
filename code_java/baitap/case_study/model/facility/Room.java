package case_study.model.facility;


public class Room extends Facility {
    protected String freeService;

    public Room() {
    }

    public Room(String freeService) {
        this.freeService = freeService;
    }

    public Room(String id, String nameService, String areaAll, String price, String numberHumanMax, String rentalType, String freeService) {
        super(id, nameService, areaAll, price, numberHumanMax, rentalType);
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    @Override
    public String toString() {
        return "Room{" +
                "freeService='" + freeService + '\'' +
                ", id='" + id + '\'' +
                ", nameService='" + nameService + '\'' +
                ", areaAll=" + areaAll +
                ", price=" + price +
                ", numberHumanMax=" + numberHumanMax +
                ", rentalType='" + rentalType + '\'' +
                '}';
    }

    @Override
    public String getInfoToCSV() {
        return id + "," + nameService + "," + areaAll + "," + price + "," + numberHumanMax + "," + rentalType + "," + freeService;
    }
}
