package org.example.newtonpatterns.service.componets;

import org.springframework.stereotype.Component;

@Component("1")
public class HappyBirthdayMessageTemplateImpl implements MessageTemplate {
    @Override
    public String getTemplate() {
        return "HAPPY BIRTHDAY TEMPLATE";
    }
}
