package day10;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class IntegerWithStack {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        System.out.println("Nhap so luong phan tu mang:");
        int a = Integer.parseInt(scanner.nextLine());
        int arr[] = new int[a];
        System.out.println("Nhap " + a + " phan tu mang:");
        int i = 0;
        while (i != a) {
            int b = Integer.parseInt(scanner.nextLine());
            stack.push(b);
            i++;
        }
        System.out.println("Mảng trước khi đảo ngược");
        System.out.println("stack: " + stack);
        for (int j = 0; j < arr.length; j++) {
            arr[j] = stack.pop();
        }
        System.out.println("Mảng sau khi đảo ngược");
        System.out.println("stack1: " + Arrays.toString(arr));
        Stack<String> stack1 = new Stack<>();
        System.out.println("Nhap chuoi:");
        String str = scanner.nextLine();
        String[] arrNew = str.split("");
        int size = arrNew.length;
        for (int j = 0; j < size; j++) {
            stack1.push(arrNew[j]);
        }
        for (int j = 0; j < size; j++) {
            arrNew[j] = stack1.pop();
        }
        System.out.println("Chuoi ki tu truoc khi dao nguoc");
        System.out.println(str);
        System.out.println("chuoi sau khi dao nguoc");
        System.out.println(Arrays.toString(arrNew));
    }
}
