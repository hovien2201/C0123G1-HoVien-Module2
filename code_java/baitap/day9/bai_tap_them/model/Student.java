package day9.bai_tap_them.model;

import java.util.Date;

public class Student extends Person {
    private String classes;
    private int score;


    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Student() {
    }

    public Student(String classes, int score) {
        this.classes = classes;
        this.score = score;
    }

    public Student(int id, String name, String dayBirth, String gender, String classes, int score) {
        super(id, name, dayBirth, gender);
        this.classes = classes;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                super.toString() +
                "classes='" + classes + '\'' +
                ", score=" + score +
                '}';
    }

}
