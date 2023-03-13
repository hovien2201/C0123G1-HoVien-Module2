package day6.point2D_point3D;

import java.util.Arrays;
import java.util.Scanner;

public class Point3D extends Point2D {
    private float z = 0.0f;

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public Point3D() {
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public float[] getXYZ() {
        float[] coordinates = new float[3];
        coordinates[0] = this.x;
        coordinates[1] = this.y;
        coordinates[2] = this.z;
        return coordinates;
    }

    @Override
    public String toString() {
        return "Point3D{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Point2D point2D = new Point2D();
        System.out.println("Nhap toa do x");
        float x = scanner.nextFloat();
        System.out.println("Nhap toa do y");
        float y = scanner.nextFloat();
        point2D.setXY(x, y);
        System.out.println(Arrays.toString(point2D.getXY()));
        System.out.println("Toa do 2D: " + point2D.toString());
        Point3D point3D = new Point3D();
        System.out.println("Nhap toa do x");
        x = scanner.nextFloat();
        System.out.println("Nhap toa do y");
        y = scanner.nextFloat();
        System.out.println("Nhap toa do z");
        float z = scanner.nextFloat();
        point3D.setXYZ(x, y, z);
        System.out.println(Arrays.toString(point3D.getXYZ()));
        System.out.println("Toa do 3D: " + point3D.toString());
    }
}
