package case_study.controller;

import case_study.service.BookingService;
import case_study.service.ContractService;
import case_study.service.PromotionService;
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
        BookingService bookingService=new BookingService();
        ContractService contractService=new ContractService();
        PromotionService promotionService=new PromotionService();
        boolean flag = true;
        do {
            System.out.println("----------------FURAMA-----------------");
            System.out.println("Function selection:\n" +
                    "1.\tEmployee Management\n" +
                    "2.\tCustomer Management\n" +
                    "3.\tFacility Management \n" +
                    "4.\tBooking Management\n" +
                    "5.\tPromotion Management\n" +
                    "6.\tExit\n");
            System.out.print("select function:");
            String choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    System.out.println("------------------Employee Management-----------------");
                    boolean flag1 = true;
                    do {
                        System.out.println("Function selection:\n" +
                                "1.\tDisplay list employees\n" +
                                "2.\tAdd new employee\n" +
                                "3.\tEdit employee`\n" +
                                "4.\tReturn main menu\n");
                        System.out.print("select function:");
                        String choice1 = scanner.nextLine();
                        switch (choice1) {
                            case "1":
                                System.out.println("------------------Employee Display-----------------");
                                employeeService.display();
                                break;
                            case "2":
                                System.out.println("------------------Employee Add-----------------");
                                employeeService.add();
                                break;
                            case "3":
                                System.out.println("------------------Employee Edit-----------------");
                                employeeService.edit();
                                break;
                            case "4":
                                System.out.println("back to main menu");
                                flag1 = false;
                                break;
                            default:
                                System.out.println("Enter the wrong number, please re-enter");
                        }
                    } while (flag1);
                    break;
                case "2":
                    System.out.println("----------------Customer Management-----------------");
                    boolean flag2 = true;
                    do {
                        System.out.println("Function selection:\n" +
                                "1.\tDisplay list customers\n" +
                                "2.\tAdd new customer\n" +
                                "3.\tEdit customer\n" +
                                "4.\tReturn main menu\n");
                        System.out.print("select function:");
                        String choice2 = scanner.nextLine();
                        switch (choice2) {
                            case "1":
                                System.out.println("----------------Customer Display-----------------");
                                customerService.display();
                                break;
                            case "2":
                                System.out.println("----------------Customer Add-----------------");
                                customerService.add();
                                break;
                            case "3":
                                System.out.println("----------------Customer Edit----------------");
                                customerService.edit();
                                break;
                            case "4":
                                System.out.println("back to main menu");
                                flag2 = false;
                                break;
                            default:
                                System.out.println("Enter the wrong number, please re-enter");
                        }
                    } while (flag2);
                    break;
                case "3":
                    System.out.println("-----------------Facility Management----------------");
                    boolean flag3 = true;
                    do {
                        System.out.println("Function selection:\n" +
                                "1.\tDisplay list facility\n" +
                                "2.\tAdd new facility\n" +
                                "3.\tDisplay list facility maintenance\n" +
                                "4.\tReturn main menu\n");
                        System.out.print("select function:");
                        String choice2 = scanner.nextLine();
                        switch (choice2) {
                            case "1":
                                System.out.println("-----------------Facility Display----------------");
                                facilityService.display();
                                break;
                            case "2":
                                System.out.println("-----------------Facility Add----------------");
                                facilityService.add();
                                break;
                            case "3":
                                System.out.println("-----------------Facility DisplayMaintenance----------------");
                                facilityService.displayMaintenance();
                                break;
                            case "4":
                                System.out.println("back to main menu");
                                flag3 = false;
                                break;
                            default:
                                System.out.println("Enter the wrong number, please re-enter");
                        }
                    } while (flag3);
                    break;
                case "4":
                    boolean flag4=true;
                    do {
                        System.out.println("------------------Booking Management-----------------");
                        System.out.println("Function selection:\n" +
                                "1.\tAdd new booking\n" +
                                "2.\tDisplay list booking\n" +
                                "3.\tCreate new contract\n" +
                                "4.\tDisplay list contracts\n" +
                                "5.\tEdit contracts\n" +
                                "6.\tReturn main menu\n");
                        System.out.print("select function:");
                        String choice4 = scanner.nextLine();
                        switch (choice4){
                            case "1":
                                System.out.println("-------------------------------------customer information-------------------------------------");
                                customerService.display();
                                System.out.println();
                                System.out.println("-------------------------------------facility information-------------------------------------");
                                facilityService.display();
                                System.out.println("-------------------------------------Booking Add-------------------------------------");
                                bookingService.add();
                                break;
                            case "2":
                                System.out.println("-------------------------------------Booking Display-------------------------------------");
                                bookingService.display();
                                break;
                            case "3":
                                System.out.println("-------------------------------------customer information-------------------------------------");
                                customerService.display();
                                System.out.println("-------------------------------------Booking Display-------------------------------------");
                                bookingService.display();
                                System.out.println("-------------------------------------Contract Add-------------------------------------");
                                contractService.add();
                                break;
                            case "4":
                                System.out.println("-------------------------------------Contract Display------------------------------------");
                                contractService.display();
                                break;
                            case "5":
                                System.out.println("-------------------------------------Contract Edit-------------------------------------");
                                contractService.edit();
                                break;
                            case "6":
                                System.out.println("back to main menu");
                                flag4=false;
                                break;
                            default:
                                System.out.println("Enter the wrong number, please re-enter");
                        }
                    }while (flag4);
                    break;
                case "5":
                    boolean flag5=true;
                    do {
                        System.out.println("-------------------Promotion Management---------------------");
                        System.out.println("Function selection:\n" +
                                "1.\tDisplay list customers use service\n" +
                                "2.\tDisplay list customers get voucher\n" +
                                "3.\tReturn main menu\n");
                        System.out.print("select function:");
                        String choice4=scanner.nextLine();
                        switch (choice4){
                            case "1":
                                System.out.println("-----------------------Display list customers use service-----------------------");
                                promotionService.displayListUse();
                                break;
                            case "2":
                                System.out.println("-----------------------Display list customers get voucher--------------------------");
                                break;
                            case "3":
                                System.out.println("Return main menu!!");
                                flag5=false;
                                break;
                            default:
                                System.out.println("Enter the wrong number, please re-enter");
                        }
                    }while (flag5);

                    break;
                case "6":
                    System.out.println("You escaped");
                    flag = false;
                    break;
                default:
                    System.out.println("Enter the wrong number, please re-enter");
            }
        } while (flag);
    }
}
