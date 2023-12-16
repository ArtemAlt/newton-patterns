package org.example.newtonpatterns.service.util;

import org.springframework.stereotype.Service;

@Service
public class MessageTemplateCreator {

    public String createTemplateByCode(String code) {
        return switch (code) {
            case "1" -> "HAPPY BIRTHDAY TEMPLATE";
            case "2" -> "WELCOME TEMPLATE";
            case "3" -> "INFORMATION TEMPLATE";
            default -> "";
        };
    }
}
