package org.sinsumi.sfg_di.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("ES")
@Service("i18NService")
public class i18NSpanishGreetingServiceImpl implements GreetingService {
    @Override
    public String myGreeting() {
        return "Hola Mundo - ES";
    }
}
