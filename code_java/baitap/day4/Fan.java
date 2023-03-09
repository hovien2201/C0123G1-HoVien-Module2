package day4;

import java.util.Scanner;

public class Fan {
    private final int SLOW = 1;
    private final int MEDIUM = 2;
    private final int FAST = 3;
    private int speed = 1;
    private boolean on = false;
    private String color = "blue";
    private double radius = 5;

    public boolean isOn() {
        return on;
    }

    public String getColor() {
        return color;
    }

    public double getRadius() {
        return radius;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Fan() {
    }


    public Fan(int speed, boolean on, String color, double radius) {
        this.speed = speed;
        this.on = on;
        this.color = color;
        this.radius = radius;
    }

    public String toString() {
        String state = "";
        if (this.isOn()) {
            state += ("Fan is on\n");
            state += ("Speed: " + this.speed + "\n");
        } else {
            state += ("Fan is off\n");
        }
        state += ("Color: " + this.color + "\n");
        state += ("Radius: " + this.radius + "\n");
        return state;
    }

    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.setSpeed(fan1.FAST);
        fan1.setRadius(10);
        fan1.setColor("Yellow");
        fan1.setOn(true);
        Fan fan2 = new Fan();
        fan2.setSpeed(fan2.SLOW);
        fan2.setRadius(5);
        fan2.setColor("blue");
        fan2.setOn(false);
        Scanner sc = new Scanner(System.in);
        System.out.println("bam 1 de bat quat");
        int a = sc.nextInt();
        if (a == 1) {
            System.out.println((fan1));
        }
        System.out.println("bam 2 de tat quat");
        int b = sc.nextInt();
        if (b == 2) {
            System.out.println((fan2));
        }

    }

}

