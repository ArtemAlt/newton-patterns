package org.example.newtonpatterns.service.componets;

import org.springframework.stereotype.Component;

@Component
public class InfoMessageTemplateImpl implements MessageTemplate {
    @Override
    public String getTemplate() {
        return "INFORMATION TEMPLATE";
    }

    @Override
    public String currentCode() {
        return "3";
    }
}
