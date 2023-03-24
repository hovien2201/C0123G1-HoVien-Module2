package case_study.model;

public abstract class Facility {
    protected String name;
    protected int areaAll;
    protected int price;
    protected int numberHumanMax;
    protected String rentalType;

    public Facility() {
    }

    public Facility(String name, int area, int price, int numberHumanMax, String rentalType) {
        this.name = name;
        this.areaAll = area;
        this.price = price;
        this.numberHumanMax = numberHumanMax;
        this.rentalType = rentalType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getArea() {
        return areaAll;
    }

    public void setArea(int area) {
        this.areaAll = area;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getNumberHumanMax() {
        return numberHumanMax;
    }

    public void setNumberHumanMax(int numberHumanMax) {
        this.numberHumanMax = numberHumanMax;
    }

    public String getRentalType() {
        return rentalType;
    }

    public void setRentalType(String rentalType) {
        this.rentalType = rentalType;
    }

    @Override
    public String toString() {
        return "Facility{" +
                "name='" + name + '\'' +
                ", areaAll=" + areaAll +
                ", price=" + price +
                ", numberHumanMax=" + numberHumanMax +
                ", rentalType='" + rentalType + '\'' +
                '}';
    }
}
