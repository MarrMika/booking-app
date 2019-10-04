package com.example.demo.services;

import com.example.demo.domains.Blocking;
import com.example.demo.domains.Booking;
import com.example.demo.domains.User;
import jdk.nashorn.internal.ir.Block;

import java.util.List;

public interface BookingService {

    Booking findById(String  id);

    List<Booking> findAll();

    void deleteById(String id);

    Booking  update(Booking booking);

}
