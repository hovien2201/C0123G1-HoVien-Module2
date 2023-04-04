package case_study.model.person;

public class Customer extends Person {
    private String typeOfGuest;
    private String address;

    public Customer() {
    }

    public Customer(String code, String name, String dayBirth, String gender, int idNumber, int phoneNumber, String email, String typeOfGuest, String address) {
        super(code, name, dayBirth, gender, idNumber, phoneNumber, email);
        this.typeOfGuest = typeOfGuest;
        this.address = address;
    }

    public String getTypeOfGuest() {
        return typeOfGuest;
    }

    public void setTypeOfGuest(String typeOfGuest) {
        this.typeOfGuest = typeOfGuest;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                ", code=" + code +
                ", name='" + name + '\'' +
                ", dayBirth='" + dayBirth + '\'' +
                ", gender='" + gender + '\'' +
                ", idNumber=" + idNumber +
                ", phoneNumber=" + phoneNumber +
                ", email='" + email + '\'' +
                "typeOfGuest='" + typeOfGuest + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public String getInfoToCSV() {
        return code + "," + name + "," + dayBirth + "," + gender + "," + idNumber + "," + phoneNumber + "," + email + "," + typeOfGuest + "," + address;
    }
}
