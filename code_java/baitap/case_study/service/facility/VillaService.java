package case_study.service.facility;


import case_study.model.facility.Villa;
import case_study.repository.facility.VillaRepository;
import case_study.service.interface_service.IAddService;
import case_study.service.interface_service.IDisplayMaintenance;
import case_study.service.interface_service.IDisplayService;
import case_study.service.interface_service.IReadVilla;
import case_study.util.CheckRegexAll;
import case_study.util.read_wirte.ReadAndWrite;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class VillaService implements IAddService, IReadVilla, IDisplayService, IDisplayMaintenance {
    private final String PATH = "case_study\\util\\file\\villa.csv";
    Scanner scanner = new Scanner(System.in);
    static Map<Villa, Integer> villaServiceMap = new LinkedHashMap<>();
    VillaRepository villaRepository = new VillaRepository();

    @Override
    public void add() {
        System.out.println("Nhap ma dich vu(SVVL-XXXX)");
        boolean flag1 = true;
        String id = null;
        do {
            id = scanner.nextLine();
            if (CheckRegexAll.checkIdVilla(id)) {
                flag1 = false;
            } else {
                System.out.println("Moi nhap lai");
            }
        } while (flag1);
        System.out.println("Tên dịch vụ (Viet hoa dau tu)");
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
                flag4 = true;
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
                flag7 = true;
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
        System.out.println("Diện tích hồ bơi");
        String areaPool = null;
        boolean flag5 = true;
        do {
            areaPool = scanner.nextLine();
            if (CheckRegexAll.checkArea(areaPool)) {
                flag5 = false;
            } else {
                System.out.println("Moi nhap lai");
            }
        } while (flag5);
        System.out.println("Số tầng");
        String numberOfFloors = null;
        boolean flag6 = true;
        do {
            numberOfFloors = scanner.nextLine();
            if (CheckRegexAll.checkPriceAndNumberOfFloors(numberOfFloors)) {
                flag6 = true;
            } else {
                System.out.println("Moi nhap lai");
            }
        } while (flag6);
        Villa villa = new Villa(id, nameService, area, price, numberHumanMax, rentalType, roomStandard, areaPool, numberOfFloors);
        Integer value = 0;
        readVilla();
        villaServiceMap.put(villa, value);
        villaRepository.add(villa, value);
    }

    @Override
    public void displayMaintenance() {

    }

    @Override
    public void display() {

    }

    @Override
    public Map<Villa, Integer> readVilla() {
        Map<Villa, Integer> villaIntegerMap = new LinkedHashMap<>();
        int size = ReadAndWrite.readFile(PATH).size();
        List<String> list = ReadAndWrite.readFile(PATH);
        for (int i = 0; i < size; i++) {
            String[] arr = list.get(i).split(",");
            villaIntegerMap.put(new Villa(arr[0], arr[1], arr[2], arr[3], arr[4], arr[5], arr[6], arr[7], arr[8]), Integer.parseInt(arr[9]));
        }
        villaServiceMap = villaIntegerMap;
        return villaServiceMap;
    }
}
