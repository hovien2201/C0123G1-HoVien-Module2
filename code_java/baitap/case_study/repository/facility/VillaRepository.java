package case_study.repository.facility;


import case_study.model.facility.Villa;
import case_study.repository.interface_repository.IVillaRepository;
import case_study.util.read_wirte.ReadAndWrite;

import java.util.List;

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
}
