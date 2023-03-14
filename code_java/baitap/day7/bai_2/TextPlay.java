package day7.bai_2;


public class TextPlay {
    public static void main(String[] args) {
        Shape[] shape = new Shape[3];
        shape[0] = new Circle();
        shape[1] = new Rectangle();
        shape[2] = new Square();
        System.out.println("Diện tích các hình:");
        for (Shape s : shape) {
            System.out.println(s);
            if (s instanceof HowToColor) {
                ((HowToColor) s).howToColor();
            }
        }
    }
}
