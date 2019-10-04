package com.example.demo.services;

import com.example.demo.domains.Blocking;
import com.example.demo.domains.User;
import jdk.nashorn.internal.ir.Block;

import java.util.List;

public interface BlockingService {

    Blocking findById(String id);

    List<Blocking> findAll();

    void deleteById(String id);

    Blocking update(Blocking blocking);

}
