package day2;

import java.util.Scanner;

public class TimGiaTriNhoNhatMang2Chieu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m, n;
        System.out.println("Nhập độ dài phần tử của mảng lớn:");
        m = sc.nextInt();
        System.out.println("Nhập độ dài phần tử của mảng nhỏ trong mảng lớn:");
        n = sc.nextInt();
        int[][] arr = new int[m][n];
        int a = 0, b = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("Nhập phần tử [" + i + "][" + j + "] của mảng");
                arr[i][j] = sc.nextInt();
            }
        }
        int min = arr[0][0];
        System.out.println("Mảng 2 chiều bạn nhập là: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
                if (min > arr[i][j]) {
                    min = arr[i][j];
                    a = i;
                    b = j;
                }
            }
            System.out.println();
        }
        System.out.println("Số nhỏ nhất trong mảng là: " + min + " Tọa độ của nó là:[" + a + "][" + b + "]");
    }
}
