package com.springexamples.controllers;

import com.springexamples.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * Created by johnnyGrimes on 13/02/2018.
 */
@Controller
public class GetterInjectedController {

    private GreetingService greetingService;

    public String sayHello() {
        return  greetingService.sayGreeting();
    }

    @Autowired
    @Qualifier("getterGreetingServiceImpl")
    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
}
