package org.example.newtonpatterns.service.util;

import org.example.newtonpatterns.service.componets.MessageTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class MessageTemplateCreator {

    @Autowired
    private Map<String, MessageTemplate> map;


    public String createTemplateByCode(String code) {
        MessageTemplate template = map.get(code);
        if (template == null) {
            throw new UnsupportedOperationException(code + " not supported");
        }
        return template.getTemplate();
    }
}

