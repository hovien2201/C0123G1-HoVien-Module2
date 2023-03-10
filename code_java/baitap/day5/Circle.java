package day5;

public class Circle {
    private static double radius = 1.0;
    private static String color = "red";

    public Circle(double radius) {
        Circle.radius = radius;
    }

    public Circle() {

    }

    protected double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public static double getAre() {
        return Math.PI * Math.pow(radius, 2);
    }
}
