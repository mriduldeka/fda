package com.app.fda.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {
    @GetMapping("/hello")
    public String index() {
        System.out.println("Print orders from FDA");
        return "orders from FDA";
    }
}
