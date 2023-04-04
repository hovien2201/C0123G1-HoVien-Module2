package case_study.service.person;

import case_study.model.person.Customer;
import case_study.repository.person.CustomerRepository;
import case_study.service.interface_service.IAddService;
import case_study.service.interface_service.IDisplayService;
import case_study.service.interface_service.IEditService;
import case_study.util.CheckRegexAll;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CustomerService implements IAddService, IDisplayService, IEditService {
    Scanner scanner = new Scanner(System.in);
    CustomerRepository customerRepository = new CustomerRepository();
    static List<Customer> customerList = new LinkedList<>();

    public void read() {
        customerList = customerRepository.read();
    }
    public List<Customer> returnList(){
        read();
        return customerList;
    }
    @Override
    public void add() {
        read();
        System.out.println("Customer's code");
        boolean check;
        String code;
        do {
            check = false;
            code = scanner.nextLine();
            for (int i = 0; i < customerList.size(); i++) {
                if (code == customerList.get(i).getCode()) {
                    System.out.println("You entered it wrong, please re-enter");
                    check = true;
                }
            }
        } while (check);
        System.out.println("Full name");
        String name = scanner.nextLine();
        System.out.println("Day birth(dd/mm/yyyy)");
        String dayBirth = null;
        boolean flag1 = true;
        do {
            dayBirth = scanner.nextLine();
            if (CheckRegexAll.checkDayBirth(dayBirth)) {
                flag1 = false;
            } else {
                System.out.println("You entered it wrong, please re-enter");
            }
        } while (flag1);
        System.out.println("Gender");
        String gender = scanner.nextLine();
        System.out.println("ID Number");
        int idNumber = Integer.parseInt(scanner.nextLine());
        System.out.println("Number phone");
        int numberPhone = Integer.parseInt(scanner.nextLine());
        System.out.println("Email");
        String email = scanner.nextLine();
        System.out.println("Type of guest");
        boolean flag = true;
        String typeOfGuest = "";
        do {
            System.out.print(
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
                    System.out.println("You entered it wrong, please re-enter");
            }
        } while (flag);
        System.out.println("Address");
        String address = scanner.nextLine();
        Customer customer = new Customer(code, name, dayBirth, gender, idNumber, numberPhone, email, typeOfGuest, address);
        customerRepository.add(customer);
        System.out.println("new added Success");
    }

    @Override
    public void edit() {
        System.out.println("Enter the name you want to edit");
        String name = scanner.nextLine();
        boolean flag = true;
        for (int i = 0; i < customerList.size(); i++) {
            if (name.equals(customerList.get(i).getName())) {
                System.out.println("Information customers want to edit: " + customerList.get(i));
                System.out.print("Customer's code");
                String code = scanner.nextLine();
                System.out.print("Full name");
                String name1 = scanner.nextLine();
                System.out.print("Day birth(dd/mm/yyyy)");
                String dayBirth = null;
                boolean flag3 = true;
                do {
                    dayBirth = scanner.nextLine();
                    if (CheckRegexAll.checkDayBirth(dayBirth)) {
                        flag3 = false;
                    } else {
                        System.out.println("You entered it wrong, please re-enter");
                    }
                } while (flag3);
                System.out.print("Gender");
                String gender = scanner.nextLine();
                System.out.print("ID number");
                int idNumber = Integer.parseInt(scanner.nextLine());
                System.out.print("Number phone");
                int numberPhone = Integer.parseInt(scanner.nextLine());
                System.out.print("Email");
                String email = scanner.nextLine();
                System.out.print("Type of guest");
                boolean flag1 = true;
                String typeOfGuest = "";
                do {
                    System.out.println(
                            "1. Diamond\n" +
                                    "2. Platinium\n" +
                                    "3. Gold\n" +
                                    "4. Silver\n" +
                                    "5. Member");
                    System.out.print("select function:");
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
                            System.out.println("You entered it wrong, please re-enter\n");
                    }
                } while (flag1);
                System.out.print("Address");
                String address = scanner.nextLine();
                Customer customer = new Customer(code, name1, dayBirth, gender, idNumber, numberPhone, email, typeOfGuest, address);
                customerRepository.edit(customer, i);
                System.out.println("Successful fix");
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
        for (Customer c : customerList) {
            System.out.println(c);
        }
    }
}
