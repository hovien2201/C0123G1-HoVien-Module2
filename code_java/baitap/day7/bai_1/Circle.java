package day7.bai_1;

public class Circle extends Shape {
    private double radius = 1.0;
    private double speed = 1.0;

    public Circle(String color, boolean filled, double radius, double speed) {
        super(color, filled);
        this.radius = radius;
        this.speed = speed;
    }

    public Circle() {
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
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
                + "Bán kính="
                + getRadius()
                + ", Diện tích=" +
                +getAcreage();
    }

    @Override
    public void resize(double speed) {
        radius += (speed * radius / 100);
    }
}
