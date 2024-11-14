package org.sinsumi.sfg_di.service;

import org.springframework.stereotype.Service;

@Service
public class SetterGreetingServiceImpl implements GreetingService {
    @Override
    public String myGreeting() {
        return "Hello World --Setter";
    }
}
