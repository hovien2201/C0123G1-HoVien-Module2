package case_study.repository;

import case_study.model.Booking;
import case_study.model.facility.House;
import case_study.model.facility.Room;
import case_study.model.facility.Villa;
import case_study.repository.interface_repository.IBookingRepository;
import case_study.util.CheckRegexAll;
import case_study.util.read_wirte.ReadAndWrite;

import java.util.*;

public class BookingRepository implements IBookingRepository {
    private final String PATH = "case_study\\util\\file\\booking.csv";
    static TreeSet<Booking> bookingTreeSet = new TreeSet<>();

    @Override
    public void add(Booking booking) {
        String str = booking.getInfoToCSV();
        bookingTreeSet.add(booking);
        ReadAndWrite.writeFile(PATH, str, true);
    }

    @Override
    public TreeSet<Booking> read() {
        TreeSet<Booking> treeSet = new TreeSet<>();
        List<String> stringList = ReadAndWrite.readFile(PATH);
        for (int i = 0; i < stringList.size(); i++) {
            String[] arr = stringList.get(i).split(",");
            treeSet.add(new Booking(arr[0], arr[1], arr[2], arr[3], arr[4], arr[5], arr[6]));
        }
        bookingTreeSet = treeSet;
        return bookingTreeSet;
    }

    @Override
    public void countValue(String str) {
        List<String> stringList = new ArrayList<>();
        String string = "";
        if (CheckRegexAll.checkIdHouse(str)) {
            Map<House, Integer> map = new HashMap<>();
            stringList = ReadAndWrite.readFile("case_study\\util\\file\\house.csv");
            for (int i = 0; i < stringList.size(); i++) {
                String[] arr = stringList.get(i).split(",");
                if (arr[0].equals(str)) {
                    House house = new House(arr[0], arr[1], arr[2], arr[3], arr[4], arr[5], arr[6], arr[7]);
                    int value = Integer.parseInt(arr[8]) + 1;
                    string = house.getInfoToCSV() + "," + value;
                    if (i == 0) {
                        ReadAndWrite.writeFile("case_study\\util\\file\\house.csv", string, false);
                    } else {
                        ReadAndWrite.writeFile("case_study\\util\\file\\house.csv", string, true);
                    }
                } else {
                    House house = new House(arr[0], arr[1], arr[2], arr[3], arr[4], arr[5], arr[6], arr[7]);
                    int value = Integer.parseInt(arr[8]);
                    string = house.getInfoToCSV() + "," + value;
                    if (i == 0) {
                        ReadAndWrite.writeFile("case_study\\util\\file\\house.csv", string, false);
                    } else {
                        ReadAndWrite.writeFile("case_study\\util\\file\\house.csv", string, true);
                    }
                }
            }

        } else if (CheckRegexAll.checkIdVilla(str)) {
            stringList = ReadAndWrite.readFile("case_study\\util\\file\\villa.csv");
            Map<Villa, Integer> map = new HashMap<>();
            for (int i = 0; i < stringList.size(); i++) {
                String[] arr = stringList.get(i).split(",");
                if (arr[0].equals(str)) {
                    Villa villa = new Villa(arr[0], arr[1], arr[2], arr[3], arr[4], arr[5], arr[6], arr[7], arr[8]);
                    int value = Integer.parseInt(arr[9]) + 1;
                    string = villa.getInfoToCSV() + "," + value;
                    if (i == 0) {
                        ReadAndWrite.writeFile("case_study\\util\\file\\villa.csv", string, false);
                    } else {
                        ReadAndWrite.writeFile("case_study\\util\\file\\villa.csv", string, true);
                    }
                } else {
                    Villa villa = new Villa(arr[0], arr[1], arr[2], arr[3], arr[4], arr[5], arr[6], arr[7], arr[8]);
                    int value = Integer.parseInt(arr[9]);
                    string = villa.getInfoToCSV() + "," + value;
                    if (i == 0) {
                        ReadAndWrite.writeFile("case_study\\util\\file\\villa.csv", string, false);
                    } else {
                        ReadAndWrite.writeFile("case_study\\util\\file\\villa.csv", string, true);
                    }
                }
            }
        } else {
            stringList = ReadAndWrite.readFile("case_study\\util\\file\\room.csv");
            Map<Room, Integer> map = new HashMap<>();
            for (int i = 0; i < stringList.size(); i++) {
                String[] arr = stringList.get(i).split(",");
                if (arr[0].equals(str)) {
                    Room room = new Room(arr[0], arr[1], arr[2], arr[3], arr[4], arr[5], arr[6]);
                    int value = Integer.parseInt(arr[7]) + 1;
                    string = room.getInfoToCSV() + "," + value;
                    if (i == 0) {
                        ReadAndWrite.writeFile("case_study\\util\\file\\room.csv", string, false);
                    } else {
                        ReadAndWrite.writeFile("case_study\\util\\file\\room.csv", string, true);
                    }
                } else {
                    Room room = new Room(arr[0], arr[1], arr[2], arr[3], arr[4], arr[5], arr[6]);
                    int value = Integer.parseInt(arr[7]);
                    string = room.getInfoToCSV() + "," + value;
                    if (i == 0) {
                        ReadAndWrite.writeFile("case_study\\util\\file\\room.csv", string, false);
                    } else {
                        ReadAndWrite.writeFile("case_study\\util\\file\\room.csv", string, true);
                    }
                }
            }
        }
    }

}
