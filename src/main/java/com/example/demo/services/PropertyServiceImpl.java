package com.example.demo.services;

import com.example.demo.domains.Property;
import com.example.demo.repositories.PropertyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class PropertyServiceImpl implements PropertyService {


    private PropertyRepository propertyRepository;

    @Autowired
    public PropertyServiceImpl(PropertyRepository propertyRepository) {
        this.propertyRepository = propertyRepository;
    }

    @Override
    public Property findById(String id) {

        return propertyRepository.getOne(id);
    }

    @Override
    public List<Property> findAll() {

        return propertyRepository.findAll();
    }

    @Override
    public void deleteById(String id) {

        propertyRepository.deleteById(id);

    }

    @Override
    public Property update(Property property) {

        return propertyRepository.save(property);
    }

}
