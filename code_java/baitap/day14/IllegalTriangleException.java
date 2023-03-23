package day14;

import java.util.Scanner;

public class IllegalTriangleException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a=0, b = 0, c=0;
        System.out.println("Nhập 3 cạnh tam giác: ");
        boolean flag=true;
        while (flag) {
            try {
                System.out.println("Nhập a: ");
                a = Integer.parseInt(scanner.nextLine());
                System.out.println("Nhập b: ");
                b = Integer.parseInt(scanner.nextLine());
                System.out.println("Nhập c: ");
                c = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Không phải số");
                System.out.println(e.getMessage());
                System.out.println("Mời nhập lại");
                continue;
            }
            try {
                System.out.println(checkTriangleEdge(a, b, c));
            } catch (TriangleEdgeException e) {
                System.out.println(e.getMessage());
                System.out.println("Mời nhập lại");
                continue;
            }
            flag=false;
        }
        System.out.println("Chương trình đã chạy xong");
    }

    public static boolean checkTriangleEdge(int a, int b, int c) throws TriangleEdgeException {
        if (a < 0 || b < 0 || c < 0) {
            throw new TriangleEdgeException("Cạnh không được nhỏ hơn 0");
        }else if (a + b <= c || a + c <= b || b + c <= a) {
            throw new TriangleEdgeException("3 cạnh không thỏa mản là cạnh tam giác");
        } else {
            System.out.println("Đây là tam giác");
            return true;
        }
    }
}
