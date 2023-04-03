package case_study.service.interface_service;

import case_study.model.facility.House;

import java.util.Map;

public interface IReadHouse {
    Map<House,Integer> readHouse();
}
