package case_study.repository.facility;


import case_study.model.facility.Villa;
import case_study.repository.interface_repository.IVillaRepository;
import case_study.util.read_wirte.ReadAndWrite;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class VillaRepository implements IVillaRepository {
    private final String PATH = "case_study\\util\\file\\villa.csv";

    @Override
    public void add(Villa villa, Integer value) {
        List<String> stringList = ReadAndWrite.readFile(PATH);
        String str = villa.getInfoToCSV();
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
    public Map<Villa, Integer> readVilla() {
        Map<Villa, Integer> villaIntegerMap = new LinkedHashMap<>();
        int size = ReadAndWrite.readFile(PATH).size();
        List<String> list = ReadAndWrite.readFile(PATH);
        for (int i = 0; i < size; i++) {
            String[] arr = list.get(i).split(",");
            villaIntegerMap.put(new Villa(arr[0], arr[1], arr[2], arr[3], arr[4], arr[5], arr[6], arr[7], arr[8]), Integer.parseInt(arr[9]));
        }
        return villaIntegerMap;
    }
}
