package com.example.demo.services;

import com.example.demo.domains.Booking;

import java.util.List;

public interface BookingService {

    Booking findById(String id);

    List<Booking> findAll();

    void deleteById(String id);

    Booking update(Booking booking);

}
