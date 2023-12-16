package org.example.newtonpatterns.service.componets;

import org.springframework.stereotype.Component;

@Component("3")
public class InfoMessageTemplateImpl implements MessageTemplate {
    @Override
    public String getTemplate() {
        return "INFORMATION TEMPLATE";
    }
}
