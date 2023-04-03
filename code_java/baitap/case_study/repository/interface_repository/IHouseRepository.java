package case_study.repository.interface_repository;

import case_study.model.facility.Facility;
import case_study.model.facility.House;

import java.util.Map;

public interface IHouseRepository {
    void add(House house, Integer value);
    Map<House,Integer> readHouse();
}
