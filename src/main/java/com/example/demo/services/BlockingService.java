package com.example.demo.services;

import com.example.demo.domains.Blocking;

import java.util.List;

public interface BlockingService {

    Blocking findById(String id);

    List<Blocking> findAll();

    void deleteById(String id);

    Blocking update(Blocking blocking);

}
