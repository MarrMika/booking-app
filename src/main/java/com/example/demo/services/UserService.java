package com.example.demo.services;

import com.example.demo.domains.User;

import java.util.List;

public interface UserService {

    User findUserById(Long id);

    List<User> findAllUsers();
}
