package case_study.repository.interface_repository;

import case_study.model.Contract;

import java.util.TreeSet;

public interface IContractRepository {
    void add(Contract contract);
    TreeSet<Contract> read();
}
