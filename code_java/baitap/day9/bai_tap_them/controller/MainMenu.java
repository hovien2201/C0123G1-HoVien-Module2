package day9.bai_tap_them.controller;


import day9.bai_tap_them.service.IntructorService;
import day9.bai_tap_them.service.StudentService;

import java.util.Scanner;


public class MainMenu {
    public static void DisplayMenu() {
        Scanner scanner = new Scanner(System.in);
        StudentService studentService = new StudentService();
        IntructorService intructorService = new IntructorService();
        boolean check = true;
        do {
            System.out.println("Chọn chức năng theo số (để tiếp tục):\n" +
                    "1. Thêm mới giảng viên hoặc học sinh\n" +
                    "2. Xóa giảng viên hoặc học sinh\n" +
                    "3. Xem danh sách giảng viên hoặc học sinh\n" +
                    "4. Thoát\n" +
                    "Chọn chức năng:");
            int n = Integer.parseInt(scanner.nextLine());
            switch (n) {
                case 1:
                    System.out.println("Bạn muốn thêm :\n" +
                            "1:Học viên\n" +
                            "2:Giáo viên\n" +
                            "Số khác: không thêm nữa");
                    int a = Integer.parseInt(scanner.nextLine());
                    if (a == 1) {
                        studentService.add();
                    } else if (a == 2) {
                        intructorService.add();
                    } else {
                        System.out.println("Bạn đã không thêm nữa");
                    }
                    break;
                case 2:
                    System.out.println("Bạn muốn xóa :\n" +
                            "1:Học viên\n" +
                            "2:Giáo viên\n" +
                            "Số khác: không xóa nữa");
                    int c = Integer.parseInt(scanner.nextLine());
                    if (c == 1) {
                        studentService.delete();
                    } else if (c == 2) {
                        intructorService.delete();
                    } else {
                        System.out.println("Bạn đã không xóa nữa");
                    }
                    break;
                case 3:
                    System.out.println("Bạn muốn xem danh sách của ai:\n" +
                            "1:Học viên\n" +
                            "2:Giảng viên\n" +
                            "3: Cả 2"+
                            "số khác: không xem nữa");
                    int b = Integer.parseInt(scanner.nextLine());
                    if (b == 1) {
                        studentService.display();
                    } else if (b == 2) {
                        intructorService.display();
                    } else if (b==3) {
                        studentService.display();
                        intructorService.display();
                    } else {
                        System.out.println("Bạn đã không xem nữa");
                    }
                    break;
                case 4:
                    System.out.println("Bạn đã thoát");
                    check = false;
                    break;
                default:
                    System.out.println("Bạn đã chọn sai số xin chọn lại");

            }
        } while (check);
    }
}
