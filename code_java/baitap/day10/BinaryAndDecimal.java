package day10;

import java.util.Scanner;
import java.util.Stack;

public class BinaryAndDecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        System.out.println("Nhap so nguyen n bat ki");
        int n = scanner.nextInt();
        int phanDu = 0;
        while (n != 0) {
            n = n / 2;
            phanDu = n % 2;
            stack.push(phanDu);
        }
        System.out.print("Nhi phan cua so nguyen n la: ");
        for (Integer s : stack) {
            System.out.print(s);
        }
    }
}
