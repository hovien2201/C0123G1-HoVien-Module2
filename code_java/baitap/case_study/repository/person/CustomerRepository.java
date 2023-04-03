package case_study.repository.person;

import case_study.model.person.Customer;
import case_study.repository.interface_repository.ICustomerRepository;
import case_study.util.read_wirte.ReadAndWrite;

import java.util.List;

public class CustomerRepository implements ICustomerRepository {
    private final String PATH = "case_study/util/file/customer.csv";

    @Override
    public void add(Customer customer) {
        List<String> stringList = ReadAndWrite.readFile(PATH);
        stringList.add(customer.getInfoToCSV());
        for (int i = 0; i < stringList.size(); i++) {
            if (i == 0) {
                ReadAndWrite.writeFile(PATH, stringList.get(i), false);
            } else {
                ReadAndWrite.writeFile(PATH, stringList.get(i), true);
            }
        }
    }

    @Override
    public void edit(Customer customer, int i) {
        List<String> stringList = ReadAndWrite.readFile(PATH);
        stringList.set(i, customer.getInfoToCSV());
        for (int j = 0; j < stringList.size(); j++) {
            if (j == 0) {
                ReadAndWrite.writeFile(PATH, stringList.get(j), false);
            } else {
                ReadAndWrite.writeFile(PATH, stringList.get(j), true);
            }
        }
    }
}
