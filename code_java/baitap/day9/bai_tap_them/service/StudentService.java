package day9.bai_tap_them.service;

import day9.bai_tap_them.model.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentService implements IService {
    Scanner scanner = new Scanner(System.in);
    static ArrayList<Student> students = new ArrayList<>();

    static {
        students.add(new Student(1, "Vien", "22 / 01 / 2001", "Nam", "C0123", 9));
    }

    @Override
    public void display() {
        System.out.println("Danh sach hoc vien:");
        for (Student s : students) {
            System.out.println(s);
        }
    }

    @Override
    public void add() {
        System.out.println("NHập id");
        int id = Integer.parseInt(scanner.nextLine());
        int count = 0;
        for (int i = 0; i < students.size(); i++) {
            if (id == students.get(i).getId()) {
                System.out.println("id học viên có rồi");
                return;
            } else {
                count++;
            }
        }
        if (count == students.size()) {
            System.out.println("NHập tên ");
            String name = scanner.nextLine();
            System.out.println("NHập ngày sinh ");
            String birday = scanner.nextLine();
            System.out.println("NHập giới tính ");
            String gender = scanner.nextLine();
            System.out.println("NHập lớp học ");
            String classes = scanner.nextLine();
            System.out.println("NHập nhập điểm ");
            double score = Double.parseDouble(scanner.nextLine());
            students.add(new Student(id, name, birday, gender, classes, (int) score));
            System.out.println("Thêm học sinh thành công");
        }
    }

    @Override
    public void delete() {
        System.out.println("Nhập id học viên cần xóa");
        int id = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId() == id) {
                System.out.println("Bạn có muốn xoá  id  " + id + " này ko  " +
                        "\n 1. Có" +
                        "\n 2. Không");
                int choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        students.remove(students.get(i));
                        System.out.println("Bạn xoá thành công");
                        break;
                    case 2:
                        System.out.println("Bạn đã không xoá");
                }
                return;
            }
        }
        System.out.println("không tìm thấy id học viên này");

    }


}


