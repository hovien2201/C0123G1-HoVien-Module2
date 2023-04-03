package case_study.repository.interface_repository;

import case_study.model.facility.Villa;

import java.util.Map;

public interface IVillaRepository {
    void add(Villa villa,Integer value);
    Map<Villa,Integer> readVilla();
}
