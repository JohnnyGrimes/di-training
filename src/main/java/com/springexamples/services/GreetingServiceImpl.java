package com.springexamples.services;

import org.springframework.stereotype.Service;

/**
 * Created by johnnyGrimes on 13/02/2018.
 */
@Service
public class GreetingServiceImpl implements GreetingService {

    public static final String HELLO_GURUS = "Hello, Gurus original service";

    @Override
    public String sayGreeting() {
        return HELLO_GURUS;
    }
}
