package com.workshop.workshop.controller;

import com.workshop.workshop.entities.Users;
import org.apache.catalina.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value =  "/users")
public class UserController {

    @GetMapping(value = "/list")
    public ResponseEntity<Users> list() {
        Users u = new Users(1L, "user1@gmail.com", "99999-9999", "user1", "1234god");
        return ResponseEntity.ok().body(u);
    }
}
