package case_study.model.person;

public class Employee extends Person {
    private String level;
    private String location;
    private int wage;

    public Employee() {
    }

    public Employee(String code, String name, String dayBirth, String gender, int idNumber, int phoneNumber, String email, String level, String location, int wage) {
        super(code, name, dayBirth, gender, idNumber, phoneNumber, email);
        this.level = level;
        this.location = location;
        this.wage = wage;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getWage() {
        return wage;
    }

    public void setWage(int wage) {
        this.wage = wage;
    }

    @Override
    public String toString() {
        return "Employee{" +
                ", code=" + code +
                ", name='" + name + '\'' +
                ", dayBirth='" + dayBirth + '\'' +
                ", gender='" + gender + '\'' +
                ", idNumber=" + idNumber +
                ", phoneNumber=" + phoneNumber +
                ", email='" + email + '\'' +
                "level='" + level + '\'' +
                ", location='" + location + '\'' +
                ", wage=" + wage +
                '}';
    }

    public String getInfoToCSV() {
        return code + "," + name + "," + dayBirth + "," + gender + "," + idNumber + "," + phoneNumber + "," + email + "," + level + "," + location + "," + wage;
    }
}
