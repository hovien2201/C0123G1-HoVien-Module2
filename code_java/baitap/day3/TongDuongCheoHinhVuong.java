package day3;

import java.util.Scanner;

public class TongDuongCheoHinhVuong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m;
        System.out.println("Nhập độ dài phần tử của mảng:");
        m = sc.nextInt();
        int[][] arr = new int[m][m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                System.out.println("Nhập phần tử [" + i + "][" + j + "] của mảng");
                arr[i][j] = sc.nextInt();
            }
        }
        int sum=0;
        System.out.println("Mảng hình vuông bạn nhập là: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
                if(j==i){
                    sum=sum+arr[i][j];
                }
            }
            System.out.println();
        }
        System.out.println("Tổng đường chéo hình vuông là:"+ sum    );
    }
}
