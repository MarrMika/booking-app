package com.example.demo.services;

import com.example.demo.domains.User;
import com.example.demo.repositories.UserRepository;

import java.util.List;

public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @Override
    public User findUserById(Long id) {
        return userRepository.getOne(id);
    }

    @Override
    public List<User> findAllUsers() {

        return userRepository.findAll();
    }
}
