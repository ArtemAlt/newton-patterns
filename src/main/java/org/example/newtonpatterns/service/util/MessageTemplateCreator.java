package org.example.newtonpatterns.service.util;

public class MessageTemplateCreator {

    public String createTemplateByCode(String code) {
        return switch (code) {
            case "1" -> "HAPPY BIRTHDAY";
            case "2" -> "WELCOME TEMPLATE";
            case "3" -> "INFORMATION TEMPLATE";
            default -> "";
        };
    }
}
