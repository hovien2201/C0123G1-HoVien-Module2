package day9.bai_tap_them.service;

import day9.bai_tap_them.model.Intructor;

import java.util.ArrayList;
import java.util.Scanner;

public class IntructorService implements IService {
    Scanner scanner = new Scanner(System.in);
    static ArrayList<Intructor> intructors = new ArrayList<>();

    static {
        intructors.add(new Intructor(1, "Trung", "30/11/1998", "Nam", "Dạy thực hành"));
    }

    @Override
    public void display() {
        System.out.println("Danh sách giáo viên:");
        for (Intructor s : intructors) {
            System.out.println(s);
        }
    }

    @Override
    public void add() {
        System.out.println("NHập id");
        int id = Integer.parseInt(scanner.nextLine());
        int count = 0;
        for (int i = 0; i < intructors.size(); i++) {
            if (id == intructors.get(i).getId()) {
                System.out.println("id giáo viên có rồi");
                return;
            } else {
                count++;
            }
        }
        if (count == intructors.size()) {
        }
        System.out.println("NHập tên ");
        String name = scanner.nextLine();
        System.out.println("NHập ngày sinh ");
        String dayBirth = scanner.nextLine();
        System.out.println("NHập giới tính ");
        String gender = scanner.nextLine();
        System.out.println("NHập lớp môn dạy ");
        String tech = scanner.nextLine();
        Intructor intructor = new Intructor(id, name, dayBirth, gender, tech);
        intructors.add(intructor);
    }

    @Override
    public void delete() {
        System.out.println("Nhập id giáo viên cần xóa");
        int id = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < intructors.size(); i++) {
            if (intructors.get(i).getId() == id) {
                System.out.println("Bạn có muốn xoá giáo viên có id=" + id + " này ko  " +
                        "\n 1. Có" +
                        "\n 2. Không");
                int choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        intructors.remove(intructors.get(i));
                        System.out.println("Bạn xoá thành công");
                        break;
                    case 2:
                        System.out.println("Bạn đã không xoá");
                }
                return;
            }
        }
        System.out.println("không tìm thấy id giáo viên này");

    }

}
