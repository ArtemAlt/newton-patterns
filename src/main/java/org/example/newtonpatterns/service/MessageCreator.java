package org.example.newtonpatterns.service;

import org.example.newtonpatterns.service.model.ApplicationMessage;
import org.example.newtonpatterns.service.util.MessageTemplateCreator;
import org.springframework.stereotype.Service;

@Service
public class MessageCreator {
    private final MessageTemplateCreator templateCreator;

    public MessageCreator(MessageTemplateCreator template) {
        this.templateCreator = template;
    }

    public ApplicationMessage createMsg(String code, String text) {
        return new ApplicationMessage(String.format("%s --- %s", templateCreator.createTemplateByCode(code), text));
    }
}
