package com.example.demo.controlers;


import com.example.demo.domains.Booking;
import com.example.demo.services.BookingService;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/booking")
public class BookingController {

    private BookingService bookingService;

    public BookingController(BookingService bookingService) {
        this.bookingService = bookingService;
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Booking findUser(@PathVariable("id") String id) {
        return bookingService.findById(id);
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping(value = "", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Booking> findAll() {
        return bookingService.findAll();
    }


    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping(value = "/{id}")
    public void deleteProperty(@PathVariable("id") String id) {
        bookingService.deleteById(id);
    }

    @PutMapping(value = "/update-user",
            produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    public Booking updateProperty(@RequestBody Booking booking) {
        return bookingService.update(booking);
    }
}
