package case_study.service.interface_service;

import case_study.model.Booking;

import java.util.TreeSet;

public interface IReturnBooking {
    TreeSet<Booking> returnBooking();
}
