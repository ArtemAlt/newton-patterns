package org.example.newtonpatterns.service.componets;

import org.springframework.stereotype.Component;

@Component("2")
public class WelcomeMessageTemplateImpl implements MessageTemplate {
    @Override
    public String getTemplate() {
        return "WELCOME TEMPLATE";
    }
}
