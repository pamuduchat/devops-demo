package com.demo.devopsdemo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1/welcome")
public class WelcomeController {

    @GetMapping
    public ResponseEntity<Object> message(){
        return new ResponseEntity<>("Hello, Welcome!", HttpStatus.OK);
    }
}
