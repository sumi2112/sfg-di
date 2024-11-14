package org.sinsumi.sfg_di.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
@Primary
@Service
public class PrimaryGreetingServiceImpl implements GreetingService {
    @Override
    public String myGreeting() {
        return "Hello World -- Primary";
    }
}
