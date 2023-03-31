package case_study.service.person;

import case_study.model.person.Employee;
import case_study.repository.person.EmployeeRepository;
import case_study.service.interface_service.IAddService;
import case_study.service.interface_service.IDisplayService;
import case_study.service.interface_service.IEditService;
import case_study.util.read_wirte.ReadAndWrite;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeService implements IAddService, IEditService, IDisplayService {
    EmployeeRepository employeeRepository=new EmployeeRepository();
    Scanner scanner = new Scanner(System.in);
    static List<Employee> employeeList = new ArrayList<>();
    public void read(){
        List<Employee> listE=new ArrayList<>();
        int size= ReadAndWrite.readEmployeeOrCustomer("case_study/util/file/employee.csv").size();
        List<String> list= ReadAndWrite.readEmployeeOrCustomer("case_study/util/file/employee.csv");
        for (int i = 0; i < size; i++) {
            String arr[]=list.get(i).split(",");
            listE.add(new Employee(Integer.parseInt(arr[0]),arr[1],arr[2],arr[3],Integer.parseInt(arr[4]),Integer.parseInt(arr[5]),arr[6],arr[7],arr[8],Integer.parseInt(arr[9])));
        }
        employeeList=listE;
    }

    @Override
    public void add() {
        System.out.println("Mã nhân viên");
        boolean check;
        int code;
        do {
            check=false;
            code = Integer.parseInt(scanner.nextLine());
            for (int i = 0; i < employeeList.size(); i++) {
                if (code==employeeList.get(i).getCode()){
                    System.out.println("da co nhap lai");
                    check=true;
                }
            }
        }while (check);
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
        Employee employee=new Employee(code, name, dayBirth, gender, idNumber, numberPhone, email, level, location, wage);
        employeeList.add(employee);
        System.out.println("Them thanh cong");
        employeeRepository.add(employee);
    }

    @Override
    public void edit() {
        System.out.println("Nhap ma nhan vien sua");
        int code1 = Integer.parseInt(scanner.nextLine());
        boolean flag = true;
        for (int i = 0; i < employeeList.size(); i++) {
            if (code1==employeeList.get(i).getCode()) {
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
                Employee employee=new Employee(code, name1, dayBirth, gender, idNumber, numberPhone, email, level, location, wage);
                System.out.println("Sua thanh cong");
                employeeRepository.edit(employee,i);
                flag = false;
            }
        }
        if (flag) {
            System.out.println("khong co trong danh sach");
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
