package com.project.cashbox.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/about")
public class AboutController {

    private String hello = "Добро пожаловать на сервис учет Расходов и Доходов";

    @GetMapping
    public String getHello() {
        return hello;
    }
}
