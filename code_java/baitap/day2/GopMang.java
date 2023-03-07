package day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class GopMang {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhập số lượng phần tử mảng 1");
        int a= sc.nextInt();
        Integer[] arr1= new Integer[a];
        Integer[] arrNew;
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < a; i++) {
            System.out.println("nhập phần tử thứ "+i+" mảng 1");
            int phanTu1= sc.nextInt();
            list.add(phanTu1);
        }
        System.out.println("Nhập số lượng phần tử mảng 2");
        int b=sc.nextInt();
        Integer[] arr2=new Integer[b];
        for (int j = 0; j < b; j++) {
            System.out.println("nhập phần tử thứ "+j+" mảng 2");
            int phanTu2= sc.nextInt();
            list.add(phanTu2);
        }
        arrNew=list.toArray(new Integer[0]);
        System.out.println("Mảng sau khi được gộp lại là : " + Arrays.toString(arrNew));
    }
}
