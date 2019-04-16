package com.ed.controller;

import com.ed.pojo.User;
import com.ed.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;

@RestController
@RequestMapping
public class HelloController {

    @Autowired
    private UserService userService;

    @Autowired
    private DataSource dataSource;
    @GetMapping("hello")

    public String hello(){
        User user = this.userService.queryById(8L);

        return ""+user;
    }
}
