package day7.bai_1;


public class Test {
    public static void main(String[] args) {
        double x = (double) Math.floor(Math.random() * 100);
        Shape[] shape = new Shape[3];
        shape[0] = new Circle();
        shape[1] = new Rectangle();
        shape[2] = new Square();
        System.out.println("Trước khi tăng kích thước:");
        Shape.printShape(shape);
        for (Shape s : shape) {
            s.resize(x);
        }
        System.out.println("Sau khi tăng kích thước:");
        Shape.printShape(shape);
        System.out.println("Tỉ lệ tăng là: " + x + "%");
    }
}
