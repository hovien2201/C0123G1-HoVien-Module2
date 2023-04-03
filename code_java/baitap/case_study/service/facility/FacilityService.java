package case_study.service.facility;

import case_study.model.facility.Facility;
import case_study.model.facility.House;
import case_study.model.facility.Room;
import case_study.model.facility.Villa;
import case_study.service.interface_service.IAddService;
import case_study.service.interface_service.IDisplayMaintenance;
import case_study.service.interface_service.IDisplayService;
import case_study.service.interface_service.IRead;


import java.util.*;

public class FacilityService implements IAddService, IDisplayService, IDisplayMaintenance, IRead {
    static Integer valueRoom = 0;
    static Map<Facility, Integer> facilityIntegerMap = new LinkedHashMap<>();
    Scanner scanner = new Scanner(System.in);
    RoomService roomService = new RoomService();
    VillaService villaService = new VillaService();
    HouseService houseService = new HouseService();

    @Override
    public void add() {
        boolean flag4 = true;
        do {
            System.out.println("1.\tAdd New Villa\n" +
                    "2.\tAdd New House\n" +
                    "3.\tAdd New Room\n" +
                    "4.\tBack to menu\n");
            System.out.print("select function:");
            String choice3 = scanner.nextLine();
            switch (choice3) {
                case "1":
                    villaService.add();
                    flag4 = false;
                    break;
                case "2":
                    houseService.add();
                    flag4 = false;
                    break;
                case "3":
                    roomService.add();
                    flag4 = false;
                    break;
                case "4":
                    System.out.println("back to main menu");
                    flag4 = false;
                    break;
                default:
                    System.out.println("Enter the wrong number, please re-enter");
            }
        } while (flag4);
    }

    @Override
    public void display() {
        read();
        Set<Facility> set = facilityIntegerMap.keySet();
        for (Facility x : set) {
            System.out.println(x + " ,value:" + facilityIntegerMap.get(x));
        }
    }

    @Override
    public void displayMaintenance() {

    }

    @Override
    public void read() {
        Map<Room, Integer> roomIntegerMap = roomService.readRoom();
        Map<House, Integer> houseIntegerMap = houseService.readHouse();
        Map<Villa, Integer> villaIntegerMap = villaService.readVilla();
        Map<Facility, Integer> map = new LinkedHashMap<>();
        Set<Villa> villaSet = villaIntegerMap.keySet();
        Set<Room> roomSet = roomIntegerMap.keySet();
        Set<House> houseSet = houseIntegerMap.keySet();
        for (Facility v : villaSet) {
            map.put(v, villaIntegerMap.get(v));
        }
        for (Facility h : houseSet) {
            map.put(h, houseIntegerMap.get(h));
        }
        for (Facility r : roomSet) {
            map.put(r, roomIntegerMap.get(r));
        }
        facilityIntegerMap = map;
    }
}
