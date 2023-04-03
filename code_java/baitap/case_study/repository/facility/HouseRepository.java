package case_study.repository.facility;


import case_study.model.facility.House;
import case_study.repository.interface_repository.IHouseRepository;
import case_study.util.read_wirte.ReadAndWrite;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class HouseRepository implements IHouseRepository {
    private final String PATH = "case_study/util/file/house.csv";

    @Override
    public void add(House house, Integer value) {
        List<String> stringList = ReadAndWrite.readFile(PATH);
        String str = house.getInfoToCSV();
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
    public Map<House, Integer> readHouse() {
        Map<House, Integer> houseIntegerMap = new LinkedHashMap<>();
        int size = ReadAndWrite.readFile(PATH).size();
        List<String> list = ReadAndWrite.readFile(PATH);
        for (int i = 0; i < size; i++) {
            String[] arr = list.get(i).split(",");
            houseIntegerMap.put(new House(arr[0], arr[1], arr[2], arr[3], arr[4], arr[5], arr[6], arr[7]), Integer.parseInt(arr[8]));
        }
        return houseIntegerMap;
    }
}
