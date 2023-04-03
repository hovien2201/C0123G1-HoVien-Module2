package case_study.repository.facility;

import case_study.model.facility.Room;
import case_study.repository.interface_repository.IRoomRepository;
import case_study.util.read_wirte.ReadAndWrite;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class RoomRepository implements IRoomRepository {
    private final String PATH = "case_study\\util\\file\\room.csv";

    @Override
    public void add(Room room, Integer value) {
        List<String> stringList = ReadAndWrite.readFile(PATH);
        String str = room.getInfoToCSV();
        stringList.add(str + "," + value);
        for (int i = 0; i < stringList.size(); i++) {
            if (i == 0) {
                ReadAndWrite.writeFile(PATH, stringList.get(i), false);
            } else {
                ReadAndWrite.writeFile(PATH, stringList.get(i), true);
            }
        }
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
        return roomIntegerMap;
    }

}
