package day3;

import java.util.Scanner;

public class TongCacSoMotCot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m, n;
        System.out.println("Nhập độ dài phần tử của mảng lớn:");
        m = sc.nextInt();
        System.out.println("Nhập độ dài phần tử của mảng nhỏ trong mảng lớn:");
        n = sc.nextInt();
        int[][] arr = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("Nhập phần tử [" + i + "][" + j + "] của mảng");
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Mảng 2 chiều bạn nhập là: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Cột bạn muốn tính tổng là:");
        int a = sc.nextInt();
        sum(arr, a);
    }

    public static void sum(int arrs[][], int c) {
        int sum = 0;
        if (c >= 0 && c < arrs.length) {
            for (int i = 0; i < arrs.length; i++) {
                int j = c;
                sum = sum + arrs[i][j];
            }
            System.out.println("Cột bạn muốn tính tổng: " + c + ", Tổng các phần tử cột đó là: " + sum);
        } else {
            System.out.println("Cột bạn muốn tính tổng không nằm trong mảng");
        }
    }
}
