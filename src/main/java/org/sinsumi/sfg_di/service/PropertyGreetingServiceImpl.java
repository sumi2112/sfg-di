package org.sinsumi.sfg_di.service;

import org.springframework.stereotype.Service;

@Service
public class PropertyGreetingServiceImpl implements GreetingService {
    @Override
    public String myGreeting() {
        return "Hello World -- Property";
    }
}
