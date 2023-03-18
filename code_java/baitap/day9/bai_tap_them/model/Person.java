package day9.bai_tap_them.model;


public abstract class Person {
    protected int id;
    protected String name;
    protected String dayBirth;
    protected String gender;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDayBirth() {
        return dayBirth;
    }

    public void setDayBirth(String dayBirth) {
        this.dayBirth = dayBirth;
    }

    public String isGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Person() {
    }

    public Person(int id, String name, String dayBirth, String gender) {
        this.id = id;
        this.name = name;
        this.dayBirth = dayBirth;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dayBirth=" + dayBirth +
                ", gender=" + gender +
                '}';
    }

}
