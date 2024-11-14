package org.sinsumi.sfg_di.controllers;

import org.sinsumi.sfg_di.service.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class i18NController {

    private final GreetingService greetingService;

    public i18NController(@Qualifier("i18NService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String greet() {
        return greetingService.myGreeting();
    }
}
