package case_study.repository.interface_repository;

import case_study.model.person.Employee;

public interface IEmployeeRepository {
    void add(Employee employee);
    void edit(Employee employee,int i);
}
