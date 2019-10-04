package com.example.demo.repositories;

import com.example.demo.domains.Booking;
import com.example.demo.domains.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Booking,String> {
}
