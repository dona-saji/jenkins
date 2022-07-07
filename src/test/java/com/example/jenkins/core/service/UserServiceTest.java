package com.example.jenkins.core.service;

import com.example.jenkins.core.domain.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.*;

@ActiveProfiles("test")
@SpringBootTest
public class UserServiceTest {

    @Autowired
    private UserService userService;

    @Test
    public void createTest() {
        User _user = new User();
        User user = new User();
        user.setName("user");
        user.setAge("30");
        User actualResult = userService.createOrUpdate(user);
        assertEquals(_user, actualResult);
    }
}