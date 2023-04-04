package case_study.repository.interface_repository;

import case_study.model.facility.Room;

import java.util.Map;

public interface IRoomRepository {
    void add(Room room,Integer value);
    Map<Room,Integer> readRoom();
}
