package day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class XoaPhanTuTrongMang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.println("nhap so luong phan tu mang:");
        a=sc.nextInt();
        Integer[] arr = new Integer[a];
        int count=0;
        int n;
        for (int i = 0; i < arr.length; i++) {
            System.out.println("nhap phan tu " + i);
            arr[i] = sc.nextInt();
        }
        System.out.println("nhap gia tri can xoa:");
        n = sc.nextInt();
        System.out.println("mang ban nhap la: " + Arrays.toString(arr));
        System.out.println("gia tri ban muon xoa la: " + n);
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != n) {
                list.add(arr[i]);
                count++;
            }
        }
        for (int j=0;j<arr.length;j++){
            if(arr[j]==n){
                list.add(0);
            }
        }
        if (count==arr.length){
            System.out.println("phan tu ban muon xoa khong co trong mang");
        }
        else {
            arr = list.toArray(new Integer[0]);
            System.out.println("mang sau khi xoa la" + Arrays.toString(arr));
        }
    }
}
