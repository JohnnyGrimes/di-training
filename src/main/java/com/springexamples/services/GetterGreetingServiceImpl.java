package com.springexamples.services;

import org.springframework.stereotype.Service;

/**
 * Created by johnnyGrimes on 15/02/2018.
 */
@Service
public class GetterGreetingServiceImpl implements GreetingService {

    private final String HELLO_GETTER = "Hello, getter service";

    @Override
    public String sayGreeting() {
        return HELLO_GETTER;
    }
}
