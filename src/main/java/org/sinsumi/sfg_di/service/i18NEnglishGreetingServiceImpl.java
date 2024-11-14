package org.sinsumi.sfg_di.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("EN")
@Service("i18NService")
public class i18NEnglishGreetingServiceImpl implements  GreetingService {

    @Override
    public String myGreeting() {
        return "Hello World - EN";
    }
}
