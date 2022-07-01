package com.example.jenkins.core.service.impl;

import com.example.jenkins.core.dao.mongo.UserDAO;
import com.example.jenkins.core.domain.User;
import com.example.jenkins.core.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDAO userDAO;

    @Override
    public List<User> getAllUsers() {
        return userDAO.findAll();
    }

    @Override
    public User createOrUpdate(User user) {
        return userDAO.save(user);
    }

    @Override
    public User getUser(String id) {
        return userDAO.findById(id).orElse(null);
    }
}
