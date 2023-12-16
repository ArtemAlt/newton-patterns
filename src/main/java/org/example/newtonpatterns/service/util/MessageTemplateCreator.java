package org.example.newtonpatterns.service.util;

import org.example.newtonpatterns.service.componets.MessageTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

@Service
public class MessageTemplateCreator {
    private final Map<String, MessageTemplate> map;

    @Autowired
    public MessageTemplateCreator(List<MessageTemplate> list) {
        this.map = list.stream()
                .collect(Collectors.toMap(MessageTemplate::currentCode, Function.identity()));
    }


    public String getTemplateByCode(String code) {
        MessageTemplate template = map.get(code);
        if (template == null) {
            throw new UnsupportedOperationException(code + " not supported");
        }
        return template.getTemplate();
    }
}

