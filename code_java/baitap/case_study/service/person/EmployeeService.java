package case_study.service.person;

import case_study.model.person.Employee;
import case_study.repository.person.EmployeeRepository;
import case_study.service.interface_service.IAddService;
import case_study.service.interface_service.IDisplayService;
import case_study.service.interface_service.IEditService;
import case_study.util.CheckRegexAll;
import case_study.util.read_wirte.ReadAndWrite;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeService implements IAddService, IEditService, IDisplayService {
    EmployeeRepository employeeRepository = new EmployeeRepository();
    Scanner scanner = new Scanner(System.in);
    static List<Employee> employeeList = new ArrayList<>();

    public void read() {
        employeeList=employeeRepository.read();
    }

    @Override
    public void add() {
        System.out.println("Code Employee");
        boolean check;
        int code;
        do {
            check = false;
            code = Integer.parseInt(scanner.nextLine());
            for (int i = 0; i < employeeList.size(); i++) {
                if (code == employeeList.get(i).getCode()) {
                    System.out.println("Enter the wrong number, please re-enter");
                    check = true;
                }
            }
        } while (check);
        System.out.println("Full name");
        String name = scanner.nextLine();
        System.out.println("Day birth(dd/mm/yyyy)");
        String dayBirth = null;
        boolean flag2 = true;
        do {
            dayBirth = scanner.nextLine();
            if (CheckRegexAll.checkDayBirth(dayBirth)) {
                flag2 = false;
            } else {
                System.out.println("Enter the wrong number, please re-enter");
            }
        } while (flag2);
        System.out.println("Gender");
        String gender = scanner.nextLine();
        System.out.println("ID Number");
        int idNumber = Integer.parseInt(scanner.nextLine());
        System.out.println("Number phone");
        int numberPhone = Integer.parseInt(scanner.nextLine());
        System.out.println("Email");
        String email = scanner.nextLine();
        System.out.println("Level");
        boolean flag = true;
        String level = "";
        do {
            System.out.println(
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
                    System.out.println("Enter the wrong number, please re-enter");
            }
        } while (flag);
        System.out.println("Location:");
        boolean flag1 = true;
        String location = "";
        do {
            System.out.print(
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
                    System.out.println("Enter the wrong number, please re-enter");
            }
        } while (flag1);
        System.out.println("Wage");
        int wage = Integer.parseInt(scanner.nextLine());
        Employee employee = new Employee(code, name, dayBirth, gender, idNumber, numberPhone, email, level, location, wage);
        employeeList.add(employee);
        System.out.println("successfully added new");
        employeeRepository.add(employee);
    }

    @Override
    public void edit() {
        read();
        System.out.println("Code employee edit");
        int code1 = Integer.parseInt(scanner.nextLine());
        boolean flag = true;
        for (int i = 0; i < employeeList.size(); i++) {
            if (code1 == employeeList.get(i).getCode()) {
                System.out.println("Employee information you want to edit: " + employeeList.get(i));
                System.out.println("Full name");
                String name1 = scanner.nextLine();
                System.out.println("Day birth(dd/mm/yyyy)");
                String dayBirth = null;
                boolean flag3 = true;
                do {
                    dayBirth = scanner.nextLine();
                    if (CheckRegexAll.checkDayBirth(dayBirth)) {
                        flag3 = false;
                    } else {
                        System.out.println("Enter the wrong number, please re-enter");
                    }
                } while (flag3);
                System.out.println("Gender");
                String gender = scanner.nextLine();
                System.out.println("ID Number");
                int idNumber = Integer.parseInt(scanner.nextLine());
                System.out.println("Number phone");
                int numberPhone = Integer.parseInt(scanner.nextLine());
                System.out.println("Email");
                String email = scanner.nextLine();
                System.out.println("Level:");
                boolean flag1 = true;
                String level = "";
                do {
                    System.out.println(
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
                            System.out.println("Enter the wrong number, please re-enter");
                    }
                } while (flag1);
                System.out.println("Location:");
                boolean flag2 = true;
                String location = "";
                do {
                    System.out.print(
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
                            System.out.println("Enter the wrong number, please re-enter");
                    }
                } while (flag2);
                System.out.println("Wage");
                int wage = Integer.parseInt(scanner.nextLine());
                Employee employee = new Employee(code1, name1, dayBirth, gender, idNumber, numberPhone, email, level, location, wage);
                System.out.println("successful fix");
                employeeRepository.edit(employee, i);
                flag = false;
            }
        }
        if (flag) {
            System.out.println("not in the list");
        }
    }

    @Override
    public void display() {
        read();
        for (Employee e : employeeList) {
            System.out.println(e);
        }
    }
}
