package day9.bai_tap_them.model;

import java.util.Date;

public class Student extends Person implements Comparable<Student>{
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

    public Student(int id, String name, int dayBirth, String gender, String classes, int score) {
        super(id, name, dayBirth, gender);
        this.classes = classes;
        this.score = score;
    }



    public int compareTo(Student o) {
        return this.id-o.id;
    }

    @Override
    public String toString() {
        return "Student{" +
                super.toString()+
                "classes='" + classes + '\'' +
                ", score=" + score +
                '}';
    }
}
