package app.watch;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.util.Scanner;

public class StopWatch {
    private JButton startButton;
    private JPanel panel1;
    private JButton endButton;
    public long startTime;
    public long endTime;

    public long getStartTime(long startTime) {
        return startTime;
    }

    public long getEndTime(long endTime) {
        return endTime;
    }


    public void start() {
        this.startTime = System.currentTimeMillis();
        getStartTime(startTime);
    }

    public void stop() {
        this.endTime = System.currentTimeMillis();
        getEndTime(endTime);
    }

    public void getElapsedTime() {
        long elaspedTime = (endTime - startTime);
        System.out.println("Số milisecond giây đếm đc:" + elaspedTime);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập 1 để bắt đầu đếm");
        int a = sc.nextInt();
        day4.StopWatch stopWatch = new day4.StopWatch();
        if (a == 1) {
            stopWatch.start();
        }
        System.out.println("Đang đếm thời gian");
        System.out.println("Nhập 1 để kết thúc đếm");
        int b = sc.nextInt();
        if (b == 1) {
            stopWatch.stop();
        }
        stopWatch.getElapsedTime();
    }


    private void createUIComponents() {
        // TODO: place custom component creation code here
        System.exit(0);
    }
}
