package case_study.service.facility;


import case_study.model.facility.Villa;
import case_study.repository.facility.VillaRepository;
import case_study.service.interface_service.IAddService;
import case_study.service.interface_service.IReadVilla;
import case_study.util.CheckRegexAll;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class VillaService implements IAddService, IReadVilla {
    Scanner scanner = new Scanner(System.in);
    static Map<Villa, Integer> villaServiceMap = new LinkedHashMap<>();
    VillaRepository villaRepository = new VillaRepository();

    @Override
    public void add() {
        readVilla();
        System.out.println("Service's code(SVVL-XXXX)");
        boolean flag1 = true;
        String id = null;
        do {
            id = scanner.nextLine();
            if (CheckRegexAll.checkIdVilla(id)) {
                flag1 = false;
            } else {
                System.out.println("You entered it wrong, please re-enter");
            }
        } while (flag1);
        System.out.println("Service name (Capitalize first letter");
        boolean flag2 = true;
        String nameService = null;
        do {
            nameService = scanner.nextLine();
            if (CheckRegexAll.checkNameAll(nameService)) {
                flag2 = false;
            } else {
                System.out.println("You entered it wrong, please re-enter");
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
                System.out.println("You entered it wrong, please re-enter");
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
                System.out.println("You entered it wrong, please re-enter");
            }
        } while (flag4);
        System.out.println("Maximum number of people");
        String numberHumanMax = null;
        boolean flag7 = true;
        do {
            numberHumanMax = scanner.nextLine();
            if (CheckRegexAll.checkNumberHumanMax(numberHumanMax)) {
                flag7 = false;
            } else {
                System.out.println("You entered it wrong, please re-enter");
            }
        } while (flag7);
        System.out.println("rental type");
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
                    System.out.println("Year");
                    rentalType = scanner.nextLine() + "Year";
                    flag = false;
                    break;
                case "2":
                    System.out.println("Month");
                    rentalType = scanner.nextLine() + "Month";
                    flag = false;
                    break;
                case "3":
                    System.out.println("Day");
                    rentalType = scanner.nextLine() + "Day";
                    flag = false;
                    break;
                case "4":
                    System.out.println("Hour");
                    rentalType = scanner.nextLine() + "Hour";
                    flag = false;
                    break;
                default:
                    System.out.println("You entered it wrong, please re-enter");
            }
        } while (flag);

        System.out.println("Room standard");
        String roomStandard = scanner.nextLine();
        System.out.println("Pool area");
        String areaPool = null;
        boolean flag5 = true;
        do {
            areaPool = scanner.nextLine();
            if (CheckRegexAll.checkArea(areaPool)) {
                flag5 = false;
            } else {
                System.out.println("You entered it wrong, please re-enter");
            }
        } while (flag5);
        System.out.println("number of floors");
        String numberOfFloors = null;
        boolean flag6 = true;
        do {
            numberOfFloors = scanner.nextLine();
            if (CheckRegexAll.checkPriceAndNumberOfFloors(numberOfFloors)) {
                flag6 = false;
            } else {
                System.out.println("You entered it wrong, please re-enter");
            }
        } while (flag6);
        Villa villa = new Villa(id, nameService, area, price, numberHumanMax, rentalType, roomStandard, areaPool, numberOfFloors);
        Integer value = 0;
        villaServiceMap.put(villa, value);
        villaRepository.add(villa, value);
    }

    @Override
    public Map<Villa, Integer> readVilla() {
        villaServiceMap=villaRepository.readVilla();
        return villaServiceMap;
    }
}
