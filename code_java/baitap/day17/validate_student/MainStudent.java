package day17.validate_student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainStudent {

    static List<Student> studentList = new ArrayList<>();
    Student student = new Student();

    static {
        Student student1 = new Student("Vien", "C0123G", "0867561009");
        studentList.add(student1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean check = true;
        do {
            System.out.println("Chọn chức năng theo số (để tiếp tục):\n" +
                    "1. Thêm mới \n" +
                    "2. Hiển thị\n" +
                    "3. Thoát\n" +
                    "Chọn chức năng:");
            int n = Integer.parseInt(scanner.nextLine());
            switch (n) {
                case 1:
                    add();
                    break;
                case 2:
                    display();
                    break;
                case 3:
                    System.out.println("Bạn đã thoát ");
                    check = false;
                    break;
                default:
                    System.out.println("Bạn đã nhập sai xin mời nhập lại");
            }
        } while (check);
    }

    public static boolean checkClasses(String str) {
        String regex = "^[APC][0-9]{4}[GHIK]$";
        if (str.matches(regex)) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean checkName(String str) {
        String regex = "^[A-Z][a-z]{0,}\\s([A-Z][a-z]{0,}\\s){0,}[A-Z][a-z]{0,}$";
        if (str.matches(regex)) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean checkNumberPhone(String str) {
        String regex = "^((\\+84)|0)([0-9]{9})$";
        if (str.matches(regex)) {
            return true;
        } else {
            return false;
        }
    }

    public static void display() {
        for (Student s : studentList) {
            System.out.println(s);
        }
    }

    public static void add() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ten");
        boolean flag2 = true;
        String name = "";
        do {
            name = scanner.nextLine();
            if (checkName(name)) {
                flag2 = false;
            } else {
                System.out.println("Tên sai khuôn mẫu(có họ và tên, chữ cái đầu phải viết hoa, các từ cách nhau bằng khoảng trống) mời nhập lại");
            }
        } while (flag2);
        System.out.println("Nhap lop ");
        boolean flag = true;
        String classes = "";
        do {
            classes = scanner.nextLine();
            if (checkClasses(classes)) {
                flag = false;
            } else {
                System.out.println("Lớp sai khuôn mẫu((C/A/P)XXXX(G/H/I/K) mời nhập lại");
            }
        } while (flag);
        System.out.println("Nhap sdt");
        boolean flag1 = true;
        String numberPhone = "";
        do {
            numberPhone = scanner.nextLine();
            if (checkNumberPhone(numberPhone)) {
                flag1 = false;
            } else {
                System.out.println("SDT sai khuôn mẫu((+84/0)XXXXXXXXX) mời nhập lại");
            }
        } while (flag1);
        studentList.add(new Student(name, classes, numberPhone));
        System.out.println("Them thanh cong");
    }
}
