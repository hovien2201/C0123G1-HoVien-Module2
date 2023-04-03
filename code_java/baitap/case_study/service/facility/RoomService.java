package case_study.service.facility;

import case_study.model.facility.Room;
import case_study.repository.facility.RoomRepository;
import case_study.service.interface_service.*;
import case_study.util.CheckRegexAll;
import case_study.util.read_wirte.ReadAndWrite;

import java.util.*;

public class RoomService implements IDisplayService, IDisplayMaintenance, IAddService, IReadRoom {

    private static final String PATH = "case_study\\util\\file\\room.csv";
    Scanner scanner = new Scanner(System.in);
    static Map<Room, Integer> roomServiceIntegerMap = new LinkedHashMap<>();
    RoomRepository roomRepository = new RoomRepository();


    public void displayMaintenance() {
    }


    public void display() {
        readRoom();
    }


    @Override
    public void add() {
        System.out.println("Nhap ma dich vu(SVRO-XXXX)");
        boolean flag1 = true;
        String id = null;
        do {

            id = scanner.nextLine();
            if (CheckRegexAll.checkIdRoom(id)) {
                flag1 = false;
            } else {
                System.out.println("Moi nhap lai");
            }
        } while (flag1);
        System.out.println("Tên dịch vụ(Viet hoa chu cai dau)");
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

        System.out.println("Dịch vụ miễn phí đi kèm");
        String freeService = scanner.nextLine();
        Room room = new Room(id, nameService, area, price, numberHumanMax, rentalType, freeService);
        Integer value = 0;
        readRoom();
        roomServiceIntegerMap.put(room, value);
        roomRepository.add(room, value);
    }

    @Override
    public Map<Room, Integer> readRoom() {
        Map<Room, Integer> roomIntegerMap = new LinkedHashMap<>();
        int size = ReadAndWrite.readFile(PATH).size();
        List<String> list = ReadAndWrite.readFile(PATH);
        for (int i = 0; i < size; i++) {
            String[] arr = list.get(i).split(",");
            roomIntegerMap.put(new Room(arr[0], arr[1], arr[2], arr[3], arr[4], arr[5], arr[6]), Integer.parseInt(arr[7]));
        }
        roomServiceIntegerMap = roomIntegerMap;
        return roomServiceIntegerMap;
    }
}
