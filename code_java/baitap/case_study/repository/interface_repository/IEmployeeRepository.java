package case_study.repository.interface_repository;

import case_study.model.person.Employee;

import java.util.List;

public interface IEmployeeRepository {
    void add(Employee employee);
    void edit(Employee employee,int i);
    List<Employee> read();
}
