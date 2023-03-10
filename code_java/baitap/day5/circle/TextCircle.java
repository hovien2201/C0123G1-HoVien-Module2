package day5.circle;


import day5.circle.Circle;

import java.util.Scanner;

public class TextCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ban kinh");
        int banKinh = sc.nextInt();
        Circle circle = new Circle(banKinh);
        System.out.println("Dien tich hinh tron:" + circle.getAre());
    }

}
