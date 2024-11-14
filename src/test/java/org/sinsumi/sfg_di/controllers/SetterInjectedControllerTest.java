package org.sinsumi.sfg_di.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.sinsumi.sfg_di.service.ConstructorGreetingServiceImpl;

class SetterInjectedControllerTest {
    SetterInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new SetterInjectedController();
        controller.setGreetingInterface(new ConstructorGreetingServiceImpl());
    }

    @Test
    void greet() {
        System.out.println(controller.greet());
    }
}