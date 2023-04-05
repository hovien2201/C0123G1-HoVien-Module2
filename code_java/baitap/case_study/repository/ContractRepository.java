package case_study.repository;

import case_study.model.Contract;
import case_study.repository.interface_repository.IContractRepository;
import case_study.util.read_wirte.ReadAndWrite;

import java.util.List;
import java.util.TreeSet;

public class ContractRepository implements IContractRepository {
    private final String PATH = "case_study\\util\\file\\contract.csv";

    @Override
    public void add(Contract contract) {
        String str = contract.getInfoToCSV();
        ReadAndWrite.writeFile(PATH, str, true);
    }

    @Override
    public TreeSet<Contract> read() {
        TreeSet<Contract> contractTreeSet = new TreeSet<>();
        List<String> stringList = ReadAndWrite.readFile(PATH);
        for (int i = 0; i < stringList.size(); i++) {
            String[] arr = stringList.get(i).split(",");
            contractTreeSet.add(new Contract(Integer.parseInt(arr[0]), arr[1], Integer.parseInt(arr[2]), Integer.parseInt(arr[3]), arr[4]));
        }
        return contractTreeSet;
    }
}
