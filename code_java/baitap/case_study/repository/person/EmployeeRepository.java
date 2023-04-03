package case_study.repository.person;

import case_study.model.person.Employee;
import case_study.repository.interface_repository.IEmployeeRepository;
import case_study.util.read_wirte.ReadAndWrite;

import java.util.List;

public class EmployeeRepository implements IEmployeeRepository {
    private final String PATH = "case_study/util/file/employee.csv";

    @Override
    public void add(Employee employee) {
        List<String> stringList = ReadAndWrite.readFile(PATH);
        stringList.add(employee.getInfoToCSV());
        for (int i = 0; i < stringList.size(); i++) {
            if (i == 0) {
                ReadAndWrite.writeFile(PATH, stringList.get(i), false);
            } else {
                ReadAndWrite.writeFile(PATH, stringList.get(i), true);
            }
        }
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
}
