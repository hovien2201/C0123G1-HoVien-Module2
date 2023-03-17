package day9.bai_tap_them.controller;

import day9.bai_tap_them.model.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

public class MainMenu {
    public static void main(String[] args) {
        TreeSet<Student> treeSet=new TreeSet<>();
        treeSet.add(new Student(1,"Vien",22/11/2001,"Nam","C0123",9));
        treeSet.add(new Student(2,"Thang",29/5/2010,"Nu","C0123",10));
        treeSet.add(new Student(4,"Dinh",2/6/2005,"Nu","C0123",8));
        treeSet.add(new Student(3,"Thien",22/3/1991,"Nam","C0123",8));
        for (Student s:treeSet) {
            System.out.println(s);
        }
    }
}
