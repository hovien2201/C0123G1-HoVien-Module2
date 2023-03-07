package day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ThemPhanTuVaoMang {
    public static void main(String[] args) {
        Integer[] arr = {4, 6, 3, 7, 8};
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("mang ban dau la: " + Arrays.toString(arr));
        System.out.println("nhap so luong phan tu ban muon them:");
        n = sc.nextInt();
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }
        for (int j = 0; j < n; j++) {
            System.out.println("nhap gia tri phan tu ban muon them");
            int phanTu = sc.nextInt();
            list.add(phanTu);
        }

        arr = list.toArray(new Integer[0]);
        System.out.println("mang sau khi them la: " + Arrays.toString(arr));
    }
}
