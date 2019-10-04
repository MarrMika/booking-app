package com.example.demo.controlers;


import com.example.demo.domains.Property;
import com.example.demo.services.PropertyService;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/properties")

public class PropertyController {

    private PropertyService propertyService;

    @ResponseStatus(HttpStatus.OK)
    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Property findUser(@PathVariable("id") String id) {
        return propertyService.findById(id);
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping(value = "", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Property> findAll() {
        return propertyService.findAll();
    }


    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping(value = "/{id}")
    public void deleteProperty(@PathVariable("id") String id) {
        propertyService.deleteById(id);
    }

    @PutMapping(value = "/update-user",
            produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    public Property updateProperty(@RequestBody Property property) {
        return propertyService.update(property);
    }
}
