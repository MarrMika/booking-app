package com.example.demo.services;

import com.example.demo.domains.Booking;
import com.example.demo.repositories.BookingRepository;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;



@Service
public class BookingServiceImpl implements BookingService {

    private BookingRepository bookingRepository;

    @Autowired
    public BookingServiceImpl(BookingRepository bookingRepository) {
        this.bookingRepository = bookingRepository;
    }

    @Override
    public Booking findById(String  id) {

        return bookingRepository.getOne(id);
    }

    @Override
    public List<Booking> findAll() {

        return bookingRepository.findAll();
    }

    @Override
    public void deleteById(String id) {

        bookingRepository.deleteById(id);

    }

    @Override
    public Booking update(Booking booking) {

        return bookingRepository.save(booking);
    }

}
