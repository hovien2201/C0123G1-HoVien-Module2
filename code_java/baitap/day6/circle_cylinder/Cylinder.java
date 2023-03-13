package day6.circle_cylinder;


import java.util.Scanner;

public class Cylinder extends Circler {
    private double height;

    public Cylinder() {
        super();
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getTotalArea() {
        return super.getArea() * this.height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + height +
                ", radius=" + radius +
                ", color='" + color +
                ", Dien tich=" + getArea() +
                ", The tich=" + getTotalArea() + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Circler circler = new Circler();
        circler.setRadius(3);
        circler.setColor("blue");
        System.out.println(circler.toString());
        Cylinder cylinder = new Cylinder();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ban kinh");
        double radius = Double.parseDouble(sc.nextLine());
        System.out.println("Nhap mau");
        String color = sc.nextLine();
        System.out.println("nhap chieu cao");
        double height = sc.nextDouble();
        cylinder.setRadius(radius);
        cylinder.setColor(color);
        cylinder.setHeight(height);
        System.out.println(cylinder.toString());

    }
}
