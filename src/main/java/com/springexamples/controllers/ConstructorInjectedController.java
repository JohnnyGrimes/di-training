package com.springexamples.controllers;

import com.springexamples.services.GreetingService;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * Created by johnnyGrimes on 13/02/2018.
 */
@Controller
public class ConstructorInjectedController {
    private GreetingService greetingService;


    public ConstructorInjectedController(@Qualifier("constructorgreetingServiceImpl") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
