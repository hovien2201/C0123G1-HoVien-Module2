package day9.bai_tap_them.model;

import java.util.Date;

public class Intructor extends Person{
    private String teach;

    public String getTeach() {
        return teach;
    }

    public void setTeach(String teach) {
        this.teach = teach;
    }

    public Intructor() {
    }

    public Intructor(String teach) {
        this.teach = teach;
    }

    public Intructor(int id, String name, int dayBirth, String gender, String teach) {
        super(id, name, dayBirth, gender);
        this.teach = teach;
    }

    @Override
    public String toString() {
        return "Intructor{" +
                super.toString()+
                "teach='" + teach +
                '}';
    }
}
