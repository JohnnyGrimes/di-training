package com.springexamples.services;

import org.springframework.stereotype.Service;

/**
 * Created by johnnyGrimes on 15/02/2018.
 */
@Service
public class ConstructorgreetingServiceImpl implements GreetingService {

    private static final String HELLO_CONSTRUCTOR = "Hello, constructor service";

    @Override
    public String sayGreeting() {
        return HELLO_CONSTRUCTOR;
    }
}
