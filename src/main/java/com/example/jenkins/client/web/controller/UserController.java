package com.example.jenkins.client.web.controller;

import com.example.jenkins.core.domain.User;
import com.example.jenkins.core.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("jenkins/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public ModelAndView loadUsers() {
        Map<String, Object> model = new HashMap<>();
        List<User> users = userService.getAllUsers();
        model.put("users", users);
        return new ModelAndView("user/users", model);
    }

    @RequestMapping(value = "/saveUser", method = RequestMethod.POST)
    @ResponseBody
    public ModelAndView saveUser(User user) {
        userService.createOrUpdate(user);
        return new ModelAndView("redirect:/jenkins/users");
    }

    @RequestMapping(value = "/details/{id}", method = RequestMethod.GET)
    @ResponseBody
    private ModelAndView userDetails(@PathVariable(value = "id") String id) {
        Map<String, Object> model = new HashMap<>();
        User user = userService.getUser(id);
        model.put("user", user);
        return new ModelAndView("user/user", model);
    }

    @RequestMapping(value = "/updateUser", method = RequestMethod.POST)
    @ResponseBody
    private ModelAndView updateUser(User user) {
        User user1 = userService.getUser(user.getId());
        user1.setName(user.getName());
        user1.setAge(user.getAge());
        userService.createOrUpdate(user1);
        return new ModelAndView("redirect:/jenkins/users");
    }
}
