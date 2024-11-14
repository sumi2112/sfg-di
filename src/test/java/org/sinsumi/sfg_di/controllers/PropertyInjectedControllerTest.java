package org.sinsumi.sfg_di.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.sinsumi.sfg_di.service.ConstructorGreetingServiceImpl;

class PropertyInjectedControllerTest {

    PropertyInjectedController propertyInjectedController;

    @BeforeEach
    void setUp() {
        propertyInjectedController = new PropertyInjectedController();
        propertyInjectedController.greetingService = new ConstructorGreetingServiceImpl();

    }

    @Test
    void greet() {
        propertyInjectedController.greet();
        System.out.println(propertyInjectedController.greet());
    }
}