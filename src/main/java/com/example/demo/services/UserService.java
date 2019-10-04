package com.example.demo.services;

import com.example.demo.domains.User;

import java.util.List;

public interface UserService {

    User findById(String id);

    List<User> findAll();

    void deleteById(String  id);

    User update(User user);

}
