package case_study.service.facility;


import case_study.model.facility.House;
import case_study.repository.facility.HouseRepository;
import case_study.service.interface_service.IAddService;
import case_study.service.interface_service.IDisplayMaintenance;
import case_study.service.interface_service.IDisplayService;
import case_study.service.interface_service.IReadHouse;
import case_study.util.CheckRegexAll;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class HouseService implements IAddService, IDisplayService, IDisplayMaintenance, IReadHouse {
    private final String PATH = "case_study/util/file/house.csv";
    Scanner scanner = new Scanner(System.in);
    static Map<House, Integer> houseServiceMap = new LinkedHashMap<>();
    HouseRepository houseRepository = new HouseRepository();

    @Override
    public void add() {
        System.out.println("Nhap ma dich vu(SVHO-XXXX)");
        boolean flag1 = true;
        String id = null;
        do {

            id = scanner.nextLine();
            if (CheckRegexAll.checkIdHouse(id)) {
                flag1 = false;
            } else {
                System.out.println("Moi nhap lai");
            }
        } while (flag1);
        System.out.println("Tên dịch vụ (Viet hoa chu cai dau)");
        boolean flag2 = true;
        String nameService = null;
        do {
            nameService = scanner.nextLine();
            if (CheckRegexAll.checkNameAll(nameService)) {
                flag2 = false;
            } else {
                System.out.println("Moi nhap lai");
            }
        } while (flag2);
        System.out.println("Diện tích sử dụng (m2)");
        String area = null;
        boolean flag3 = true;
        do {
            area = scanner.nextLine();
            if (CheckRegexAll.checkArea(area)) {
                flag3 = false;
            } else {
                System.out.println("Moi nhap lai");
            }
        } while (flag3);
        System.out.println("Chi phí thuê");
        String price = null;
        boolean flag4 = true;
        do {
            price = scanner.nextLine();
            if (CheckRegexAll.checkPriceAndNumberOfFloors(price)) {
                flag4 = false;
            } else {
                System.out.println("Moi nhap lai");
            }
        } while (flag4);
        System.out.println("Số lượng người tối đa");
        String numberHumanMax = null;
        boolean flag7 = true;
        do {
            numberHumanMax = scanner.nextLine();
            if (CheckRegexAll.checkNumberHumanMax(numberHumanMax)) {
                flag7 = false;
            } else {
                System.out.println("Moi nhap lai");
            }
        } while (flag7);
        System.out.println("Kiểu thuê");
        String rentalType = null;
        boolean flag = true;
        do {
            System.out.println("1.năm\n" +
                    "2.tháng\n" +
                    "3.ngày\n" +
                    "4.giờ");
            String choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    System.out.println("Nhap theo nam");
                    rentalType = scanner.nextLine() + "Nam";
                    flag = false;
                    break;
                case "2":
                    System.out.println("Nhap theo thang");
                    rentalType = scanner.nextLine() + "Thang";
                    flag = false;
                    break;
                case "3":
                    System.out.println("Nhap theo ngay");
                    rentalType = scanner.nextLine() + "Ngay";
                    flag = false;
                    break;
                case "4":
                    System.out.println("Nhap theo gio");
                    rentalType = scanner.nextLine() + "Gio";
                    flag = false;
                    break;
                default:
                    System.out.println("Nhap sai moi nhap lai");
            }
        } while (flag);

        System.out.println("Tiêu chuẩn phòng");
        String roomStandard = scanner.nextLine();
        System.out.println("Số tầng");
        String numberOfFloors = null;
        boolean flag5 = true;
        do {
            numberOfFloors = scanner.nextLine();
            if (CheckRegexAll.checkPriceAndNumberOfFloors(numberOfFloors)) {
                flag5 = false;
            } else {
                System.out.println("Moi nhap lai");
            }
        } while (flag5);
        House house = new House(id, nameService, area, price, numberHumanMax, rentalType, roomStandard, numberOfFloors);
        Integer value = 0;
        readHouse();
        houseServiceMap.put(house, value);
        houseRepository.add(house, value);
    }

    @Override
    public void displayMaintenance() {
    }

    @Override
    public void display() {

    }

    @Override
    public Map<House, Integer> readHouse() {
        houseServiceMap=houseRepository.readHouse();
        return houseServiceMap;
    }
}
