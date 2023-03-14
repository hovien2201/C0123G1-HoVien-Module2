package day7.bai_1;

public class Shape implements Resizeable {
    protected String color = "blue";
    protected boolean filled = true;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public Shape() {
    }

    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                ", filled=" + (isFilled() ? "filled" : "not filled") + "}";
    }

    public static void printShape(Shape[] shape) {
        for (Shape x : shape) {
            System.out.println(x.toString());
        }
    }

    @Override
    public void resize(double speed) {

    }
}
