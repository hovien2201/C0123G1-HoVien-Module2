package case_study.service;

import case_study.model.Booking;
import case_study.model.person.Customer;
import case_study.service.interface_service.IPromotionService;
import case_study.service.person.CustomerService;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;

public class PromotionService implements IPromotionService {
    Scanner scanner = new Scanner(System.in);
    BookingService bookingService = new BookingService();
    CustomerService customerService = new CustomerService();
    List<Customer> customerList = customerService.returnList();
    TreeSet<Booking> bookingTreeSet = bookingService.returnBooking();
    List<Customer> customerLinkedList = new LinkedList<>();

    @Override
    public void displayListUse() {
        bookingService.read();
        System.out.println("enter year");
        String enterYear = scanner.nextLine();
        ArrayList<Booking> arrayList = new ArrayList<Booking>();
        arrayList.addAll(bookingTreeSet);
        for (int i = 0; i < arrayList.size(); i++) {
            String[] arr = arrayList.get(i).getDayStart().split("/");
            if (enterYear.equals(arr[2])) {
                for (int j = 0; j < customerList.size(); j++) {
                    if (arrayList.get(i).getCodeClient().equals(customerList.get(j).getCode())) {
                        customerLinkedList.add(customerList.get(j));
                        break;
                    }
                }
            }
        }
        for (Customer c : customerLinkedList) {
            System.out.println(c);
        }
    }

    @Override
    public void displayListVoucher() {
        System.out.println("Quantity voucher 10%");
        int voucher10 = Integer.parseInt(scanner.nextLine());
        System.out.println("Quantity voucher 20%");
        int voucher20 = Integer.parseInt(scanner.nextLine());
        System.out.println("Quantity voucher 50%");
        int voucher50 = Integer.parseInt(scanner.nextLine());
        Stack<Booking> bookingStack = new Stack<>();
        LocalDate currentdate = LocalDate.now();
        Month currentMonth = currentdate.getMonth();
        System.out.println("Current month: " + currentMonth.getValue());
        List<Booking> arrayList = new ArrayList<>();
        arrayList.addAll(bookingTreeSet);
        for (int i = 0; i < arrayList.size(); i++) {
            String[] arr = arrayList.get(i).getDayStart().split("/");
            String month = arr[1];
            if (Integer.parseInt(month) == currentMonth.getValue()) {
                bookingStack.add(arrayList.get(i));
            }
        }
        for (int i = 0; i < bookingStack.size(); i++) {
            if (voucher10 > 0) {
                System.out.println(bookingStack.get(i));
                System.out.println("Voucher10%");
                voucher10--;
            } else if (voucher20 > 0) {
                System.out.println(bookingStack.get(i));
                System.out.println("Voucher20%");
                voucher20--;
            } else if (voucher50 > 0) {
                System.out.println(bookingStack.get(i));
                System.out.println("Voucher50%");
                voucher50--;
            } else
                break;
        }
    }
}
