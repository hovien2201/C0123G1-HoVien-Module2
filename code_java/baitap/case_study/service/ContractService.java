package case_study.service;

import case_study.model.Booking;
import case_study.model.Contract;
import case_study.model.person.Customer;
import case_study.repository.ContractRepository;
import case_study.service.interface_service.IAddService;
import case_study.service.interface_service.IDisplayService;
import case_study.service.interface_service.IEditService;
import case_study.service.interface_service.IRead;
import case_study.service.person.CustomerService;

import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

public class ContractService implements IAddService, IDisplayService, IEditService, IRead {
    Scanner scanner = new Scanner(System.in);
    TreeSet<Contract> contractTreeSet=new TreeSet<>();
    CustomerService customerService=new CustomerService();
    ContractRepository contractRepository=new ContractRepository();
    List<Customer> customerList=customerService.returnList();
    BookingService bookingService=new BookingService();


    @Override
    public void add() {
        bookingService.read();
        TreeSet<Booking> bookingTreeSet=bookingService.bookingTreeSet;
        System.out.println("number contracts");
        int numberContract=Integer.parseInt(scanner.nextLine());
        System.out.println("Booking's code");
        String codeBooking="";
        boolean flag=true;
        do {
            codeBooking= scanner.nextLine();
            for (Booking booking:bookingTreeSet){
                if (codeBooking.equals(booking.getCodeBooking())){
                    flag=false;
                }
            }
            if (flag){
                System.out.println("You entered it wrong, please re-enter");
            }
        }while (flag);
        System.out.println("Advance deposit amount");
        int advanceDepositAmount=Integer.parseInt(scanner.nextLine());
        System.out.println("total payment amount");
        int totalPaymentAmount=Integer.parseInt(scanner.nextLine());
        System.out.println("Client's code");
        String codeClient="";
        boolean flag1=true;
        do {
            codeClient=scanner.nextLine();
            for (int i = 0; i < customerList.size(); i++) {
                if (codeClient.equals(customerList.get(i).getCode())) {
                    flag1 = false;
                    break;
                }
            }
            if (flag1) {
                System.out.println("You entered it wrong, please re-enter");
            }
        }while (flag1);
        Contract contract=new Contract(numberContract,codeBooking,advanceDepositAmount,totalPaymentAmount,codeClient);
        contractRepository.add(contract);
        System.out.println("successfully added new");
    }

    @Override
    public void edit() {

    }

    @Override
    public void display() {
        read();
        System.out.println(contractTreeSet);
    }

    @Override
    public void read() {
        contractTreeSet=contractRepository.read();
    }
}
