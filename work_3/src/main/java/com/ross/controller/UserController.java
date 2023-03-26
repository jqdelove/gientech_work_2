package com.ross.controller;

import com.ross.entity.User;
import com.ross.service.UserService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @description: 接口
 * @author: jinqi
 * @create: 2023-03-26 09:23
 **/
@RestController
@RequestMapping("/api")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/users")
    public List<User> getUsers() {
        return userService.getUsers();
    }

    @GetMapping(value = "/users", produces = MediaType.APPLICATION_XML_VALUE)
    public List<User> getUsersAsXml() {
        return userService.getUsersAsXml();
    }
}
