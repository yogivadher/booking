package com.cinema.booking.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class MyController {
    @GetMapping("/greet")
    public String test(){
        return "springboot application for kubedmo is up and runing";
    }


}
