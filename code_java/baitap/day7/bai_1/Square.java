package day7.bai_1;

public class Square extends Shape {
    private double width = 1.0;
    private double speed = 1.0;

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public Square(String color, boolean filled, double width) {
        super(color, filled);
        this.width = width;
    }

    public Square() {
    }

    public double getAcreage() {
        return width * width;
    }

    @Override
    public String toString() {
        return "Square: "
                + "Kích thước cạnh ="
                + getWidth()
                + ", Diện tích=" +
                +getAcreage();
    }

    @Override
    public void resize(double speed) {
        width += (speed * width / 100);
    }
}
