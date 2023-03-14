package day7.bai_2;


public class Square extends Shape implements HowToColor {
    private double width = 1.0;

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
                + " Diện tích=" +
                getAcreage();
    }

    @Override
    public void howToColor() {
        System.out.println("color all four sides");
    }
}
