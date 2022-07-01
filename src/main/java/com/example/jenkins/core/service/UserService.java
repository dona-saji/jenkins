package com.example.jenkins.core.service;

import com.example.jenkins.core.domain.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();

    User createOrUpdate(User user);

    User getUser(String id);
}
