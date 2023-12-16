package org.example.newtonpatterns.service.componets;

import org.springframework.stereotype.Component;

@Component
public class HappyBirthdayMessageTemplateImpl implements MessageTemplate {
    @Override
    public String getTemplate() {
        return "HAPPY BIRTHDAY TEMPLATE";
    }

    @Override
    public String currentCode() {
        return "1";
    }

}
