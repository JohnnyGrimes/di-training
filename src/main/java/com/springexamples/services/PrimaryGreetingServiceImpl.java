package com.springexamples.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created by johnnyGrimes on 15/02/2018.
 */
@Service
@Primary
@Profile({"eng", "default"})
public class PrimaryGreetingServiceImpl implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello from the primary greeting service";
    }
}
