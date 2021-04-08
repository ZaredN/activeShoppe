package za.co.momentum.activeShoppe.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import za.co.momentum.activeShoppe.Welcome;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class WelcomeController {

    private static final String template = "Hello, %s!";
    private static final AtomicLong counter = new AtomicLong();

    @GetMapping("/welcome")
    public Welcome welcome(@RequestParam(value ="name", defaultValue = "Momentum")String name){
        return new Welcome(counter.incrementAndGet(),String.format(template,name),0);
    }



}
