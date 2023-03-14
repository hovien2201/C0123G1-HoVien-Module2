package day7.bai_2;


public class Circle extends Shape {
    private double radius = 1.0;

    public Circle() {
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    protected double getRadius() {
        return radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }


    public double getAcreage() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public String toString() {
        return "Circle: "
                + " Diện tích="
                + getAcreage();
    }
}
