package day7.bai_2;


public class Rectangle extends Shape {
    private double lengths = 3.0;
    private double width = 1.0;

    public double getLengths() {
        return lengths;
    }

    public void setLengths(double lengths) {
        this.lengths = lengths;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public Rectangle(String color, boolean filled, double lengths, double width) {
        super(color, filled);
        this.lengths = lengths;
        this.width = width;
    }

    public Rectangle() {
    }

    public double getAcreage() {
        return lengths * width;
    }

    @Override
    public String toString() {
        return "Rectangle: "
                + " Diện tích=" +
                getAcreage();
    }
}
