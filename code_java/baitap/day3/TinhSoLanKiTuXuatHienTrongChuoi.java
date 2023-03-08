package day3;

import java.util.Scanner;

public class TinhSoLanKiTuXuatHienTrongChuoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chuoi:");
        String str= sc.nextLine();
        System.out.println("Nhap 1 ki tu muon kiem tra:");
        char a=sc.next().charAt(0);
        int sum=0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)==a){
                sum++;
            }
        }
        System.out.println("Số lần kí tự "+a+" xuất hiện trong chuỗi "+str+" là: "+sum+" lần");
    }
}
