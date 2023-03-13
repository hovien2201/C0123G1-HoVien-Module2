package day6.circle_cylinder;


public class Circler {
    protected double radius;
    protected String color;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Circler() {
    }

    public Circler(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public String toString1() {
        return getArea() + "";
    }

    @Override
    public String toString() {
        return "Circler{" +
                ", radius=" + radius +
                ", color='" + color + "'"+
                ", Dien tich=" + getArea() + '\'' +
                '}';
    }
}
