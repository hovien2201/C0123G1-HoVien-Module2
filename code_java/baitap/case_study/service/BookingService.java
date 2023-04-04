package case_study.service;

import case_study.model.Booking;
import case_study.model.facility.Facility;
import case_study.model.person.Customer;
import case_study.repository.BookingRepository;
import case_study.service.facility.FacilityService;
import case_study.service.interface_service.IAddService;
import case_study.service.interface_service.IDisplayService;
import case_study.service.interface_service.IEditService;
import case_study.service.interface_service.IRead;
import case_study.service.person.CustomerService;
import case_study.util.CheckRegexAll;

import java.util.*;

public class BookingService implements IAddService, IDisplayService, IEditService, IRead {
    Scanner scanner = new Scanner(System.in);
    TreeSet<Booking> bookingTreeSet = new TreeSet<>();
    BookingRepository bookingRepository = new BookingRepository();
    FacilityService facilityService = new FacilityService();
    Map<Facility, Integer> facilityIntegerMap = facilityService.returnMap();
    CustomerService customerService = new CustomerService();
    List<Customer> customerList = customerService.returnList();


    @Override
    public void add() {
        System.out.println("------------------add booking---------------------");
        System.out.println("Code client");
        String codeClient = "";
        boolean flag = true;
        do {
            codeClient = scanner.nextLine();
            for (int i = 0; i < customerList.size(); i++) {
                if (codeClient.equals(customerList.get(i).getCode())) {
                    flag = false;
                    break;
                }
            }
            if (flag == true) {
                System.out.println("You entered it wrong, please re-enter");
            }
        } while (flag);
        System.out.println("code service");
        String codeService = "";
        boolean flag1 = true;
        do {
            codeService = scanner.nextLine();
            Set<Facility> facilitySet = facilityIntegerMap.keySet();
            for (Facility x : facilitySet) {
                if (codeService.equals(x.getId())) {
                    flag1 = false;
                    break;
                }
            }
            if (flag1 == true) {
                System.out.println("You entered it wrong, please re-enter");
            }
        } while (flag1);
        System.out.println("Code booking");
        String codeBooking = scanner.nextLine();
//        boolean flag3=true;
//        do {
//            codeBooking=scanner.nextLine();
//            for (int i = 0; i < bookingTreeSet.size(); i++) {
//                if (bookingTreeSet.contains(codeBooking))
//            }
//        }while (flag3);
        System.out.println("Day start");
        String dayStart = "";
        boolean flag2 = true;
        do {
            dayStart = scanner.nextLine();
            if (CheckRegexAll.checkDayStartAndEnd(dayStart)) {
                flag2 = false;
            } else {
                System.out.println("You entered it wrong, please re-enter");
            }
        } while (flag2);
        System.out.println("Day end");
        String dayEnd = "";
        boolean flag3 = true;
        do {
            dayEnd = scanner.nextLine();
            if (CheckRegexAll.checkDayStartAndEnd(dayEnd)) {
                flag3 = false;
            } else {
                System.out.println("You entered it wrong, please re-enter");
            }
        } while (flag3);
        System.out.println("Name Service");
        String nameService = scanner.nextLine();
        System.out.println("Name type of service");
        String typeOfService = scanner.nextLine();
        Booking booking = new Booking(codeClient, codeService, codeBooking, dayStart, dayEnd, nameService, typeOfService);
        bookingRepository.add(booking);
    }

    @Override
    public void edit() {

    }

    @Override
    public void display() {
        read();
        System.out.println(bookingTreeSet);
    }

    @Override
    public void read() {
        bookingTreeSet = bookingRepository.read();
    }
}
