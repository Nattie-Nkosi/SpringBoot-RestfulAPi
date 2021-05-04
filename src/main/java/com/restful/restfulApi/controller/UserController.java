package com.restful.restfulApi.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("users")
public class UserController {

    @GetMapping
    public String getUser(){
        return "GET user was called";
    }

    @PostMapping
    public String postUser(){
        return "POST user was called";
    }

    @PutMapping
    public String putUser() {
        return "PUT user was called";
    }

    @DeleteMapping
    public String deleteUser() {
        return "DELETE user was called";
    }
}
