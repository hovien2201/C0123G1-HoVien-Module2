package day13;

import java.util.Arrays;
import java.util.Scanner;

public class SettingInsertionSort {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhập số phần tử của mảng: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Nhập các phần tử của mảng: \n");
        for (int i = 0; i < n; i++) {
            System.out.printf("a[%d] = ", i);
            arr[i] = sc.nextInt();
        }
        System.out.println("Mảng đã nhập: " + Arrays.toString(arr));
        insertionSort(arr);
        System.out.println("Mảng sau khi sort: " + Arrays.toString(arr));
    }

    public static void insertionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int insert = arr[i];
            int j;
            for (j = i; j > 0; j--) {
                if (insert < arr[j - 1]) {
                    arr[j] = arr[j - 1];
                } else {
                    break;
                }
            }
            arr[j] = insert;
        }
    }
}
