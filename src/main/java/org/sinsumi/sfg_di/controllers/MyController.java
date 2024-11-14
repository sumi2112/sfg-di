package org.sinsumi.sfg_di.controllers;

import org.sinsumi.sfg_di.service.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private final GreetingService greetingService;

    //Here @
    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String printName(){
        return greetingService.myGreeting();
    }
}
