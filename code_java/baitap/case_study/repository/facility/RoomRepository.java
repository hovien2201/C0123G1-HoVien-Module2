package case_study.repository.facility;

import case_study.model.facility.Room;
import case_study.repository.interface_repository.IRoomRepository;
import case_study.util.read_wirte.ReadAndWrite;

import java.util.List;

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

}
