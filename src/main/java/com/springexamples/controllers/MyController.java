package com.springexamples.controllers;

import com.springexamples.services.GreetingService;
import org.springframework.stereotype.Controller;

/**
 * Created by johnnyGrimes on 13/02/2018.
 */
@Controller
public class MyController {

    GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
