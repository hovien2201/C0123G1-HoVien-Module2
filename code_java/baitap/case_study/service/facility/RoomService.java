package case_study.service.facility;

import case_study.model.facility.Room;
import case_study.repository.facility.RoomRepository;
import case_study.service.interface_service.*;
import case_study.util.CheckRegexAll;

import java.util.*;

public class RoomService implements  IAddService, IReadRoom {
    Scanner scanner = new Scanner(System.in);
    static Map<Room, Integer> roomServiceIntegerMap = new LinkedHashMap<>();
    RoomRepository roomRepository = new RoomRepository();

    @Override
    public void add() {
        readRoom();
        System.out.println("service code(SVRO-XXXX)");
        boolean flag1 = true;
        String id = null;
        do {

            id = scanner.nextLine();
            if (CheckRegexAll.checkIdRoom(id)) {
                flag1 = false;
            } else {
                System.out.println("Enter the wrong number, please re-enter");
            }
        } while (flag1);
        System.out.println("service name(Vietnameseize the first letter)");
        boolean flag2 = true;
        String nameService = null;
        do {
            nameService = scanner.nextLine();
            if (CheckRegexAll.checkNameAll(nameService)) {
                flag2 = false;
            } else {
                System.out.println("Enter the wrong number, please re-enter");
            }
        } while (flag2);
        System.out.println("Usable area (m2)");
        String area = null;
        boolean flag3 = true;
        do {
            area = scanner.nextLine();
            if (CheckRegexAll.checkArea(area)) {
                flag3 = false;
            } else {
                System.out.println("Enter the wrong number, please re-enter");
            }
        } while (flag3);
        System.out.println("Rental costs");
        String price = null;
        boolean flag4 = true;
        do {
            price = scanner.nextLine();
            if (CheckRegexAll.checkPriceAndNumberOfFloors(price)) {
                flag4 = false;
            } else {
                System.out.println("Enter the wrong number, please re-enter");
            }
        } while (flag4);
        System.out.print("Maximum number of people");
        String numberHumanMax = null;
        boolean flag7 = true;
        do {
            numberHumanMax = scanner.nextLine();
            if (CheckRegexAll.checkNumberHumanMax(numberHumanMax)) {
                flag7 = false;
            } else {
                System.out.println("Enter the wrong number, please re-enter");
            }
        } while (flag7);
        System.out.println("Rental type");
        String rentalType = null;
        boolean flag = true;
        do {
            System.out.println("1.Year\n" +
                    "2.Month\n" +
                    "3.Day\n" +
                    "4.Hour");
            String choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    System.out.println("enter by year");
                    rentalType = scanner.nextLine() + "Year";
                    flag = false;
                    break;
                case "2":
                    System.out.println("enter by Month");
                    rentalType = scanner.nextLine() + "Month";
                    flag = false;
                    break;
                case "3":
                    System.out.println("enter by Day");
                    rentalType = scanner.nextLine() + "Day";
                    flag = false;
                    break;
                case "4":
                    System.out.println("enter by Hour");
                    rentalType = scanner.nextLine() + "Hour";
                    flag = false;
                    break;
                default:
                    System.out.println("Enter the wrong number, please re-enter");
            }
        } while (flag);

        System.out.println("Free service included");
        String freeService = scanner.nextLine();
        Room room = new Room(id, nameService, area, price, numberHumanMax, rentalType, freeService);
        Integer value = 0;
        readRoom();
        roomServiceIntegerMap.put(room, value);
        roomRepository.add(room, value);
    }

    @Override
    public Map<Room, Integer> readRoom() {
        roomServiceIntegerMap=roomRepository.readRoom();
        return roomServiceIntegerMap;
    }
}
