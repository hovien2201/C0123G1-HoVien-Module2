package case_study.model.facility;

public abstract class Facility {
    protected String id;
    protected String nameService;
    protected String areaAll;
    protected String price;
    protected String numberHumanMax;
    protected String rentalType;

    public Facility() {
    }

    public Facility(String id, String nameService, String areaAll, String price, String numberHumanMax, String rentalType) {
        this.id = id;
        this.nameService = nameService;
        this.areaAll = areaAll;
        this.price = price;
        this.numberHumanMax = numberHumanMax;
        this.rentalType = rentalType;
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getNumberHumanMax() {
        return numberHumanMax;
    }

    public void setNumberHumanMax(String numberHumanMax) {
        this.numberHumanMax = numberHumanMax;
    }

    public String getRentalType() {
        return rentalType;
    }

    public void setRentalType(String rentalType) {
        this.rentalType = rentalType;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAreaAll() {
        return areaAll;
    }

    public void setAreaAll(String areaAll) {
        this.areaAll = areaAll;
    }

    @Override
    public String toString() {
        return "Facility{" +
                "id='" + id + '\'' +
                ", nameService='" + nameService + '\'' +
                ", areaAll=" + areaAll +
                ", price=" + price +
                ", numberHumanMax=" + numberHumanMax +
                ", rentalType='" + rentalType + '\'' +
                '}';
    }

    public String getInfoToCSV() {
        return id + "," + nameService + "," + areaAll + "," + price + "," + numberHumanMax + "," + rentalType;
    }
}
