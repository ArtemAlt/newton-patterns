package org.example.newtonpatterns.service.componets;

import org.springframework.stereotype.Component;

@Component
public class WelcomeMessageTemplateImpl implements MessageTemplate {
    @Override
    public String getTemplate() {
        return "WELCOME TEMPLATE";
    }

    @Override
    public String currentCode() {
        return "2";
    }
}
