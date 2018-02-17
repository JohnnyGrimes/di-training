package com.springexamples.controllers;

import com.springexamples.services.GreetingServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by johnnyGrimes on 13/02/2018.
 */
public class GetterInjectedControllerTest {
    private GetterInjectedController getterInjectedController;

    @Before
    public void setUp() {
        this.getterInjectedController = new GetterInjectedController();
        this.getterInjectedController.setGreetingService(new GreetingServiceImpl());
    }

    @Test
    public void testGreeting() throws Exception {
        assertEquals(GreetingServiceImpl.HELLO_GURUS, getterInjectedController.sayHello());
    }

}