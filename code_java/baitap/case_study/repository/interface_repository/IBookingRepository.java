package case_study.repository.interface_repository;

import case_study.model.Booking;
import case_study.model.person.Customer;

import java.util.List;
import java.util.TreeSet;

public interface IBookingRepository {
    void add(Booking booking);
    TreeSet<Booking> read();
}
