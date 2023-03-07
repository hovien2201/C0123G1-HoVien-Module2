package day2;

import java.util.Scanner;

public class HienThiHinh {
    public static void main(String[] args) {
        int m,n;
        Scanner sc= new Scanner(System.in);
        System.out.println("nhap m");
        m= sc.nextInt();
        System.out.println("nhap n");
        n= sc.nextInt();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
        int a;
        Scanner rc= new Scanner(System.in);
        System.out.println("nhap a");
        a= rc.nextInt();
        for (int i = 0; i <= a; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
        int b;
        Scanner dc= new Scanner(System.in);
        System.out.println("nhap b");
        b= dc.nextInt();
        for (int i = b; i >0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
