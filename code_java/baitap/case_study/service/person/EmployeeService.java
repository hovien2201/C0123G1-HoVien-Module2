package case_study.service.person;

import case_study.model.person.Employee;
import case_study.service.iterface_service.IService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeService implements IService {
    Scanner scanner = new Scanner(System.in);
    static List<Employee> employeeList = new ArrayList<>();

    @Override
    public void add() {
        System.out.println("Mã nhân viên");
        int code = Integer.parseInt(scanner.nextLine());
        System.out.println("Họ tên");
        String name = scanner.nextLine();
        System.out.println("Ngày sinh");
        String dayBirth = scanner.nextLine();
        System.out.println("Giới tính");
        String gender = scanner.nextLine();
        System.out.println("Số CMND");
        int idNumber = Integer.parseInt(scanner.nextLine());
        System.out.println("Số Điện Thoại");
        int numberPhone = Integer.parseInt(scanner.nextLine());
        System.out.println("Email");
        String email = scanner.nextLine();
        System.out.println("Trình độ");
        boolean flag = true;
        String level = "";
        do {
            System.out.println("Trình độ:\n" +
                    "1. Trung cấp\n" +
                    "2. Cao đẳng\n" +
                    "3. Đại học\n" +
                    "4. Sau Đại học");
            String choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    level = "Trung cấp";
                    flag = false;
                    break;
                case "2":
                    level = "Cao đẳng";
                    flag = false;
                    break;
                case "3":
                    level = "Đại học";
                    flag = false;
                    break;
                case "4":
                    level = "Sau Đại học";
                    flag = false;
                    break;
                default:
                    System.out.println("Bạn đã nhập sai số mời nhập lại");
            }
        } while (flag);
        System.out.println("Vị trí");
        boolean flag1 = true;
        String location = "";
        do {
            System.out.println("Vị trí:\n" +
                    "1. Lễ tân\n" +
                    "2. phục vụ\n" +
                    "3. chuyên viên\n" +
                    "4. giám sát\n" +
                    "5. quản lý\n" +
                    "6. giám đốc");
            String choice1 = scanner.nextLine();
            switch (choice1) {
                case "1":
                    location = "Lễ tân";
                    flag1 = false;
                    break;
                case "2":
                    location = "phục vụ";
                    flag1 = false;
                    break;
                case "3":
                    location = "chuyên viên";
                    flag1 = false;
                    break;
                case "4":
                    location = "giám sát";
                    flag1 = false;
                    break;
                case "5":
                    location = "quản lý";
                    flag1 = false;
                    break;
                case "6":
                    location = "giám đốc";
                    flag1 = false;
                    break;
                default:
                    System.out.println("Bạn đã nhập sai số mời nhập lại");
            }
        } while (flag1);
        System.out.println("lương");
        int wage = Integer.parseInt(scanner.nextLine());
        employeeList.add(new Employee(code, name, dayBirth, gender, idNumber, numberPhone, email, level, location, wage));
        System.out.println("Them thanh cong");
    }

    @Override
    public void edit() {
        System.out.println("Nhap ten muon sua");
        String name = scanner.nextLine();
        boolean flag=true;
        for (int i = 0; i < employeeList.size(); i++) {
            if (name.equals(employeeList.get(i).getName())) {
                System.out.println("Thong tin nhan vien ban muon sua: " + employeeList.get(i));
                System.out.println("Mã nhân viên");
                int code = Integer.parseInt(scanner.nextLine());
                System.out.println("Họ tên");
                String name1 = scanner.nextLine();
                System.out.println("Ngày sinh");
                String dayBirth = scanner.nextLine();
                System.out.println("Giới tính");
                String gender = scanner.nextLine();
                System.out.println("Số CMND");
                int idNumber = Integer.parseInt(scanner.nextLine());
                System.out.println("Số Điện Thoại");
                int numberPhone = Integer.parseInt(scanner.nextLine());
                System.out.println("Email");
                String email = scanner.nextLine();
                System.out.println("Trình độ");
                boolean flag1 = true;
                String level = "";
                do {
                    System.out.println("Trình độ:\n" +
                            "1. Trung cấp\n" +
                            "2. Cao đẳng\n" +
                            "3. Đại học\n" +
                            "4. Sau Đại học");
                    String choice = scanner.nextLine();
                    switch (choice) {
                        case "1":
                            level = "Trung cấp";
                            flag1 = false;
                            break;
                        case "2":
                            level = "Cao đẳng";
                            flag1 = false;
                            break;
                        case "3":
                            level = "Đại học";
                            flag1 = false;
                            break;
                        case "4":
                            level = "Sau Đại học";
                            flag1 = false;
                            break;
                        default:
                            System.out.println("Bạn đã nhập sai số mời nhập lại");
                    }
                } while (flag1);
                System.out.println("Vị trí");
                boolean flag2 = true;
                String location = "";
                do {
                    System.out.println("Vị trí:\n" +
                            "1. Lễ tân\n" +
                            "2. phục vụ\n" +
                            "3. chuyên viên\n" +
                            "4. giám sát\n" +
                            "5. quản lý\n" +
                            "6. giám đốc");
                    String choice1 = scanner.nextLine();
                    switch (choice1) {
                        case "1":
                            location = "Lễ tân";
                            flag2 = false;
                            break;
                        case "2":
                            location = "phục vụ";
                            flag2 = false;
                            break;
                        case "3":
                            location = "chuyên viên";
                            flag2 = false;
                            break;
                        case "4":
                            location = "giám sát";
                            flag2 = false;
                            break;
                        case "5":
                            location = "quản lý";
                            flag2 = false;
                            break;
                        case "6":
                            location = "giám đốc";
                            flag2 = false;
                            break;
                        default:
                            System.out.println("Bạn đã nhập sai số mời nhập lại");
                    }
                } while (flag2);
                System.out.println("lương");
                int wage = Integer.parseInt(scanner.nextLine());
                employeeList.remove(i);
                employeeList.add(i, new Employee(code, name1, dayBirth, gender, idNumber, numberPhone, email, level, location, wage));
                System.out.println("Sua thanh cong");
                flag=false;
            }
        }
        if (flag){
            System.out.println("khong co trong danh sach");
        }
    }

    @Override
    public void display() {
        for (Employee e : employeeList) {
            System.out.println(e);
        }
    }
}
