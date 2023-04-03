package case_study.controller;

import case_study.service.facility.FacilityService;
import case_study.service.facility.HouseService;
import case_study.service.facility.RoomService;
import case_study.service.facility.VillaService;
import case_study.service.person.CustomerService;
import case_study.service.person.EmployeeService;

import java.util.Scanner;

public class FuramaController {
    public static void displayMainMenu() {
        Scanner scanner = new Scanner(System.in);
        EmployeeService employeeService = new EmployeeService();
        CustomerService customerService = new CustomerService();
        FacilityService facilityService = new FacilityService();
        HouseService houseService = new HouseService();
        VillaService villaService = new VillaService();
        RoomService roomService = new RoomService();
        boolean flag = true;
        do {
            System.out.println("Lựa chọn chức năng:\n" +
                    "1.\tEmployee Management\n" +
                    "2.\tCustomer Management\n" +
                    "3.\tFacility Management \n" +
                    "4.\tBooking Management\n" +
                    "5.\tPromotion Management\n" +
                    "6.\tExit\n");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    boolean flag1 = true;
                    do {
                        System.out.println("Lựa chọn chức năng:\n" +
                                "1.\tDisplay list employees\n" +
                                "2.\tAdd new employee\n" +
                                "3.\tEdit employee`\n" +
                                "4.\tReturn main menu\n");
                        int choice1 = Integer.parseInt(scanner.nextLine());
                        switch (choice1) {
                            case 1:
                                employeeService.display();
                                break;
                            case 2:
                                employeeService.add();
                                break;
                            case 3:
                                employeeService.edit();
                                break;
                            case 4:
                                System.out.println("Bạn đã quay lại menu chính");
                                flag1 = false;
                                break;
                            default:
                                System.out.println("Bạn đã nhập sai số mời nhập lại");
                        }
                    } while (flag1);
                    break;
                case 2:
                    boolean flag2 = true;
                    do {
                        System.out.println("Lựa chọn chức năng:\n" +
                                "1.\tDisplay list customers\n" +
                                "2.\tAdd new customer\n" +
                                "3.\tEdit customer\n" +
                                "4.\tReturn main menu\n");
                        int choice2 = Integer.parseInt(scanner.nextLine());
                        switch (choice2) {
                            case 1:
                                customerService.display();
                                break;
                            case 2:
                                customerService.add();
                                break;
                            case 3:
                                customerService.edit();
                                break;
                            case 4:
                                System.out.println("Bạn đã quay lại menu chính");
                                flag2 = false;
                                break;
                            default:
                                System.out.println("Bạn đã nhập sai số mời nhập lại");
                        }
                    } while (flag2);
                    break;
                case 3:

                    boolean flag3 = true;
                    do {
                        System.out.println("Lựa chọn chức năng:\n" +
                                "1.\tDisplay list facility\n" +
                                "2.\tAdd new facility\n" +
                                "3.\tDisplay list facility maintenance\n" +
                                "4.\tReturn main menu\n");
                        int choice2 = Integer.parseInt(scanner.nextLine());
                        switch (choice2) {
                            case 1:
                                facilityService.display();
                                break;
                            case 2:
                                facilityService.add();
                                boolean flag4 = true;
                                do {
                                    System.out.println("1.\tAdd New Villa\n" +
                                            "2.\tAdd New House\n" +
                                            "3.\tAdd New Room\n" +
                                            "4.\tBack to menu\n");
                                    String choice3 = scanner.nextLine();
                                    switch (choice3) {
                                        case "1":
                                            villaService.add();
                                            flag4 = false;
//                                        facilityService.add();
                                            break;
                                        case "2":
                                            houseService.add();
                                            flag4 = false;
                                            break;
                                        case "3":
                                            roomService.add();
                                            facilityService.add();
                                            flag4 = false;
                                            break;
                                        case "4":
                                            System.out.println("Quay lai menu");
                                            flag4 = false;
                                            break;
                                        default:
                                            System.out.println("chon lai");
                                    }
                                } while (flag4);
                                break;
                            case 3:
                                facilityService.displayMaintenance();
                                break;
                            case 4:
                                System.out.println("Bạn đã quay lại menu chính");
                                flag3 = false;
                                break;
                            default:
                                System.out.println("Bạn đã nhập sai số mời nhập lại");
                        }
                    } while (flag3);
                    break;
                case 4:
                    System.out.println("Lựa chọn chức năng:\n" +
                            "1.\tAdd new booking\n" +
                            "2.\tDisplay list booking\n" +
                            "3.\tCreate new contract\n" +
                            "4.\tDisplay list contracts\n" +
                            "5.\tEdit contracts\n" +
                            "6.\tReturn main menu\n");
                    break;
                case 5:
                    System.out.println("Lựa chọn chức năng:\n" +
                            "1.\tDisplay list customers use service\n" +
                            "2.\tDisplay list customers get voucher\n" +
                            "3.\tReturn main menu\n");
                    break;
                case 6:
                    System.out.println("Bạn đã thoát");
                    flag = false;
                    break;
                default:
                    System.out.println("Bạn đã nhập sai số mời nhập lại");
            }
        } while (flag);
    }
}
