package case_study.repository.person;

import case_study.model.person.Employee;
import case_study.repository.interface_repository.IEmployeeRepository;
import case_study.util.read_wirte.ReadAndWrite;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository implements IEmployeeRepository {
    private final String PATH = "case_study/util/file/employee.csv";
    @Override
    public void add(Employee employee) {
        String str=employee.getInfoToCSV();
        ReadAndWrite.writeFile(PATH, str, true);
    }

    @Override
    public void edit(Employee employee, int index) {
        List<String> stringList = ReadAndWrite.readFile(PATH);
        stringList.set(index, employee.getInfoToCSV());
        for (int j = 0; j < stringList.size(); j++) {
            if (j == 0) {
                ReadAndWrite.writeFile(PATH, stringList.get(j), false);
            } else {
                ReadAndWrite.writeFile(PATH, stringList.get(j), true);
            }
        }
    }

    @Override
    public List<Employee> read() {
        List<Employee> listE = new ArrayList<>();
        List<String> list = ReadAndWrite.readFile("case_study\\util\\file\\employee.csv");
        for (int i = 0; i < list.size(); i++) {
            String arr[] = list.get(i).split(",");
            listE.add(new Employee(arr[0], arr[1], arr[2], arr[3], Integer.parseInt(arr[4]), Integer.parseInt(arr[5]), arr[6], arr[7], arr[8], Integer.parseInt(arr[9])));
        }
        return listE;
    }
}
