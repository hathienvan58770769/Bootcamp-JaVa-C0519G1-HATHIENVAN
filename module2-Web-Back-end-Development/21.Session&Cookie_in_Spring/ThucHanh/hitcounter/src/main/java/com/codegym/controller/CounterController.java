package com.codegym.controller;

import com.codegym.model.MyCounter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@SessionAttributes("myCounter")
public class CounterController {

    /* add MyCounter in model attribute */
    @ModelAttribute("myCounter")
    public MyCounter setUpCounter() {
        return new MyCounter();
    }

    @GetMapping("/")
    public String get(@ModelAttribute("myCounter") MyCounter myCounter) {
        myCounter.increment();
        return "view";
    }
}
