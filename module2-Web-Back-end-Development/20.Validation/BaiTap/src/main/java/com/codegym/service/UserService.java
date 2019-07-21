package com.codegym.service;

import com.codegym.model.User;

import java.util.List;

public interface UserService {
    List<User> findAll();

    User findById(int id);

    void save(User user);

    void remove(int id);
}
