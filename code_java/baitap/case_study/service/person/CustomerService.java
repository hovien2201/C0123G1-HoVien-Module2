package case_study.service.person;

import case_study.model.person.Customer;
import case_study.repository.person.CustomerRepository;
import case_study.service.interface_service.IAddService;
import case_study.service.interface_service.IDisplayService;
import case_study.service.interface_service.IEditService;
import case_study.util.read_wirte.ReadAndWrite;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CustomerService implements IAddService, IDisplayService, IEditService {
    Scanner scanner = new Scanner(System.in);
    CustomerRepository customerRepository = new CustomerRepository();
    static List<Customer> customerList = new LinkedList<>();

    public void read() {
        int size = ReadAndWrite.readEmployeeOrCustomer("case_study\\util\\file\\customer.csv").size();
        List<String> list = ReadAndWrite.readEmployeeOrCustomer("case_study\\util\\file\\customer.csv");
        for (int i = 0; i < size; i++) {
            String arr[] = list.get(i).split(",");
            customerList.add(new Customer(Integer.parseInt(arr[0]), arr[1], arr[2], arr[3], Integer.parseInt(arr[4]), Integer.parseInt(arr[5]), arr[6], arr[7], arr[8]));
        }
    }

    @Override
    public void add() {
        System.out.println("Mã khách hàng");
        boolean check;
        int code;
        do {
            check = false;
            code = Integer.parseInt(scanner.nextLine());
            for (int i = 0; i < customerList.size(); i++) {
                if (code == customerList.get(i).getCode()) {
                    System.out.println("Da co nhap lai");
                    check = true;
                }
            }
        } while (check);
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
        System.out.println("Loại khách");
        boolean flag = true;
        String typeOfGuest = "";
        do {
            System.out.println("Loại khách:\n" +
                    "1. Diamond\n" +
                    "2. Platinium\n" +
                    "3. Gold\n" +
                    "4. Silver\n" +
                    "5. Member");
            String choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    typeOfGuest = "Diamond";
                    flag = false;
                    break;
                case "2":
                    typeOfGuest = "Platinium";
                    flag = false;
                    break;
                case "3":
                    typeOfGuest = "Gold";
                    flag = false;
                    break;
                case "4":
                    typeOfGuest = "Silver";
                    flag = false;
                    break;
                case "5":
                    typeOfGuest = "Member";
                    flag = false;
                    break;
                default:
                    System.out.println("Bạn đã nhập sai số mời nhập lại");
            }
        } while (flag);
        System.out.println("Địa chỉ");
        String address = scanner.nextLine();
        Customer customer = new Customer(code, name, dayBirth, gender, idNumber, numberPhone, email, typeOfGuest, address);
        customerRepository.add(customer);
        System.out.println("Them thanh cong");
    }

    @Override
    public void edit() {
        System.out.println("Nhap ten muon sua");
        String name = scanner.nextLine();
        boolean flag = true;
        for (int i = 0; i < customerList.size(); i++) {
            if (name.equals(customerList.get(i).getName())) {
                System.out.println("thong tin khach hang ban muon sua: " + customerList.get(i));
                System.out.println("Mã khách hàng");
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
                System.out.println("Loại khách");
                boolean flag1 = true;
                String typeOfGuest = "";
                do {
                    System.out.println("Loại khách:\n" +
                            "1. Diamond\n" +
                            "2. Platinium\n" +
                            "3. Gold\n" +
                            "4. Silver\n" +
                            "5. Member");
                    String choice = scanner.nextLine();
                    switch (choice) {
                        case "1":
                            typeOfGuest = "Diamond";
                            flag1 = false;
                            break;
                        case "2":
                            typeOfGuest = "Platinium";
                            flag1 = false;
                            break;
                        case "3":
                            typeOfGuest = "Gold";
                            flag1 = false;
                            break;
                        case "4":
                            typeOfGuest = "Silver";
                            flag1 = false;
                            break;
                        case "5":
                            typeOfGuest = "Member";
                            flag1 = false;
                            break;
                        default:
                            System.out.println("Bạn đã nhập sai số mời nhập lại");
                    }
                } while (flag1);
                System.out.println("Địa chỉ");
                String address = scanner.nextLine();
                Customer customer = new Customer(code, name1, dayBirth, gender, idNumber, numberPhone, email, typeOfGuest, address);
                customerRepository.edit(customer, i);
                System.out.println("Sua thanh cong");
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
        for (Customer c : customerList) {
            System.out.println(c);
        }
    }
}
