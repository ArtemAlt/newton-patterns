package org.example.newtonpatterns.service.util;

import org.example.newtonpatterns.service.componets.MessageTemplate;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class MessageTemplateCreator {
    private final Map<String, MessageTemplate> map = new HashMap<>();

    public void registry(MessageTemplate template) {
        map.put(template.currentCode(), template);
    }



    public String getTemplateByCode(String code) {
        MessageTemplate template = map.get(code);
        if (template == null) {
            throw new UnsupportedOperationException(code + " not supported");
        }
        return template.getTemplate();
    }
}

