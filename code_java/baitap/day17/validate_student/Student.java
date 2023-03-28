package day17.validate_student;

public class Student {
    private String name;
    private String classes;
    private String numberPhone;

    public Student() {
    }

    public Student(String name, String classes, String numberPhone) {
        this.name = name;
        this.classes = classes;
        this.numberPhone = numberPhone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public String  getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", classes='" + classes + '\'' +
                ", numberPhone=" + numberPhone +
                '}';
    }
}
