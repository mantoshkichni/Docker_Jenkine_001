package com.example.springPaymentService.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @RequestMapping(value = "/payment", method = RequestMethod.GET)
    public String getData(){
        return "Statue 200";
    }

    @RequestMapping(value = "/payment", method = RequestMethod.POST)
    public String postData(){
        return "Data: posted, Statue 200";
    }
}
