package case_study.model.facility;


public class Room extends Facility {
    protected String freeService;

    public Room() {
    }

    public Room(String freeService) {
        this.freeService = freeService;
    }

    public Room(String nameService, int area, int price, int numberHumanMax, String rentalType, String freeService) {
        super(nameService, area, price, numberHumanMax, rentalType);
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
                ", name='" + nameService + '\'' +
                ", areaAll=" + areaAll +
                ", price=" + price +
                ", numberHumanMax=" + numberHumanMax +
                ", rentalType='" + rentalType + '\'' +
                '}';
    }
    public String getInfoToCSV() {
        return nameService + "," + areaAll + "," + price + "," + numberHumanMax + "," + rentalType + "," + freeService ;
    }
}
