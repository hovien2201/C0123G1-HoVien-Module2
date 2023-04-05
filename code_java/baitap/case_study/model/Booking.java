package case_study.model;


import java.util.Date;

public class Booking implements Comparable<Booking> {
    private String codeClient;
    private String codeService;
    private String codeBooking;
    private String dayStart;
    private String dayEnd;
    private String nameService;
    private String typeOfService;

    public Booking() {
    }

    public Booking(String codeClient, String codeService, String codeBooking, String dayStart, String dayEnd, String nameService, String typeOfService) {
        this.codeClient = codeClient;
        this.codeService = codeService;
        this.codeBooking = codeBooking;
        this.dayStart = dayStart;
        this.dayEnd = dayEnd;
        this.nameService = nameService;
        this.typeOfService = typeOfService;
    }

    public String getCodeService() {
        return codeService;
    }

    public void setCodeService(String codeService) {
        this.codeService = codeService;
    }

    public String getCodeBooking() {
        return codeBooking;
    }

    public void setCodeBooking(String codeBooking) {
        this.codeBooking = codeBooking;
    }

    public String getDayStart() {
        return dayStart;
    }

    public void setDayStart(String dayStart) {
        this.dayStart = dayStart;
    }

    public String getDayEnd() {
        return dayEnd;
    }

    public void setDayEnd(String dayEnd) {
        this.dayEnd = dayEnd;
    }

    public String getCodeClient() {
        return codeClient;
    }

    public void setCodeClient(String codeClient) {
        this.codeClient = codeClient;
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public String getTypeOfService() {
        return typeOfService;
    }

    public void setTypeOfService(String typeOfService) {
        this.typeOfService = typeOfService;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "codeClient='" + codeClient + '\'' +
                ", codeService='" + codeService + '\'' +
                ", codeBooking='" + codeBooking + '\'' +
                ", dayStart='" + dayStart + '\'' +
                ", dayEnd='" + dayEnd + '\'' +
                ", nameService='" + nameService + '\'' +
                ", typeOfService='" + typeOfService + '\'' +
                '}' + "\n";
    }

    public String getInfoToCSV() {
        return codeClient + "," + codeService + "," + codeBooking + "," + dayStart + "," + dayEnd + "," + nameService + "," + typeOfService;
    }

    @Override
    public int compareTo(Booking o) {
        if (this.dayStart.equals(o.dayStart)) {
            Date dateEnd = new Date(this.getDayEnd());
            Date dateEndO = new Date(o.getDayEnd());
            return dateEndO.after(dateEnd) ? 1 : -1;
        } else {
            Date dateStart = new Date(this.getDayStart());
            Date dateStartO = new Date(o.getDayStart());
            return dateStartO.after(dateStart) ? 1 : -1;
        }
    }

}
