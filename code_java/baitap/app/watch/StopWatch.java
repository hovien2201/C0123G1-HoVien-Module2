package app.watch;

import javax.swing.*;
import java.awt.event.ActionEvent;
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
        System.out.println("Khoang hon "+elaspedTime/1000+" giay");
    }


    public static void main(String[] args) {
        JFrame jFrame=new JFrame();
        JButton button=new  JButton("start");
        JButton button1=new JButton("stop");
        JPanel jPanel= new JPanel();
        button.setBounds(100, 150, 100, 50);
        button1.setBounds(250, 150, 100, 50);
        jFrame.add(button);
        jFrame.add(button1);
        jFrame.setSize(500, 300);// thiết lập kích thước cho của sổ
        jFrame.setLayout(null);// không sử dụng trình quản lý bố cục
        jFrame.setVisible(true);// hiển thị cửa sổ
        app.watch.StopWatch stopWatch = new app.watch.StopWatch(button,jPanel,button1);
        button.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                stopWatch.start();
                System.out.println("Dang dem thoi gian");
            }
                });
        button1.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                stopWatch.stop();
                stopWatch.getElapsedTime();
            }
        });
    }


    public StopWatch(JButton startButton, JPanel panel1, JButton endButton) {
        this.startButton = startButton;
        this.panel1 = panel1;
        this.endButton = endButton;
    }

}
