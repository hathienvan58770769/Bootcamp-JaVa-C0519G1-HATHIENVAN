package com.codegym.service;

import com.codegym.model.User;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserServiceImpl implements UserService {
    @Autowired

    @Override
    public List<User> findAll() {
        return null;
    }

    @Override
    public User findById(int id) {
        return null;
    }

    @Override
    public void save(User user) {

    }

    @Override
    public void remove(int id) {

    }
}
