package day6.point_moveablePoint;

import java.util.Scanner;

public class MoveablePoint extends Point {
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    public float getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public MoveablePoint() {
    }

    public MoveablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed() {
        float[] arr = new float[2];
        arr[0] = this.xSpeed;
        arr[1] = this.ySpeed;
        return arr;
    }

    @Override
    public String toString() {
        return "MoveablePoint{" +
                super.toString() +
                "xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                '}';
    }

    public MoveablePoint move() {
        x += xSpeed;
        y += ySpeed;
        return this;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MoveablePoint moveablePoint = new MoveablePoint();
        System.out.println("Nhap x");
        float x = scanner.nextFloat();
        System.out.println("Nhap y");
        float y = scanner.nextFloat();
        System.out.println("Nhap xSpeed");
        float xSpeed = scanner.nextFloat();
        System.out.println("Nhap ySpeed");
        float ySpeed = scanner.nextFloat();
        moveablePoint.setXY(x, y);
        moveablePoint.setSpeed(xSpeed, ySpeed);
        System.out.println(moveablePoint);
        System.out.println(moveablePoint.move());
    }
}
