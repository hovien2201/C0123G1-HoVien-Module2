package case_study.repository.facility;


import case_study.model.facility.House;
import case_study.repository.interface_repository.IHouseRepository;
import case_study.util.read_wirte.ReadAndWrite;

import java.util.List;

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
}
