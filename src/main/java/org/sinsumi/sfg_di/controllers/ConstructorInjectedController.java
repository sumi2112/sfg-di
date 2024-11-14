package org.sinsumi.sfg_di.controllers;

import org.sinsumi.sfg_di.service.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController {

    private final GreetingService greetingService;

    //Using @Autowired annotation here on contructor is optional post Spring 4.2
    public ConstructorInjectedController(@Qualifier("constructorGreetingServiceImpl") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String greet() {
        return greetingService.myGreeting();
    }
}
