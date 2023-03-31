package case_study.repository.interface_repository;

import case_study.model.person.Customer;
import case_study.model.person.Employee;

public interface ICustomerRepository {
    void add(Customer customer);
    void edit(Customer customer,int i);
}
