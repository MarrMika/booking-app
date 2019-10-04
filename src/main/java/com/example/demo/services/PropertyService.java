package com.example.demo.services;

import com.example.demo.domains.Property;

import java.util.List;

public interface PropertyService {

    Property findById(String id);

    List<Property> findAll();

    void deleteById(String id);

    Property update(Property property);

}
