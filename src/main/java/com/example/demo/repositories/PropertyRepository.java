package com.example.demo.repositories;

import com.example.demo.domains.Property;
import com.example.demo.domains.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PropertyRepository extends JpaRepository<Property,String> {


}
