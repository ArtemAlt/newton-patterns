package org.example.newtonpatterns.service;

import org.example.newtonpatterns.service.model.ApplicationMessage;
import org.example.newtonpatterns.service.util.MessageTemplateCreator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessageCreator {
    @Autowired
    private final MessageTemplateCreator templateCreator;

    public MessageCreator(MessageTemplateCreator templateCreator) {
        this.templateCreator = templateCreator;
    }

    public ApplicationMessage createMsg(String code, String text) {
        return new ApplicationMessage(String.format("%s --- %s", templateCreator.getTemplateByCode(code), text));
    }
}
