package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Arrays;
import java.util.List;

@RestController
public class OrderController {

    @GetMapping("/orders")
    public List<String> getOrders() {
        return Arrays.asList("Order1", "Order2", "Order3");
    }
}
