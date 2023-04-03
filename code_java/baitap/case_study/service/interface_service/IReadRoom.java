package case_study.service.interface_service;

import case_study.model.facility.Room;

import java.util.Map;

public interface IReadRoom {
    Map<Room,Integer> readRoom();
}
