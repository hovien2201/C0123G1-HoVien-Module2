package case_study.repository.person;

import case_study.model.person.Customer;
import case_study.repository.interface_repository.ICustomerRepository;
import case_study.util.read_wirte.ReadAndWrite;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CustomerRepository implements ICustomerRepository {
    private final String PATH = "case_study/util/file/customer.csv";

    @Override
    public void add(Customer customer) {
        String str= customer.getInfoToCSV();
        ReadAndWrite.writeFile(PATH, str, true);
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

    @Override
    public List<Customer> read() {
        List<Customer> list = new LinkedList<>();
        List<String> listStr = ReadAndWrite.readFile(PATH);
        for (int i = 0; i < listStr.size(); i++) {
            String arr[] = listStr.get(i).split(",");
            list.add(new Customer(Integer.parseInt(arr[0]), arr[1], arr[2], arr[3], Integer.parseInt(arr[4]), Integer.parseInt(arr[5]), arr[6], arr[7], arr[8]));
        }
        return list;
    }
}
