package org.example.newtonpatterns.service.util;

import org.springframework.stereotype.Service;

@Service
public class MessageTemplateCreator {

    public String createTemplateByCode(String code) {
        String result = "";
        if("1".equals(code)) {
            result = "HAPPY BIRTHDAY TEMPLATE";
        }

        if("2".equals(code)) {
            result = "WELCOME TEMPLATE";
        }

        if("3".equals(code)) {
            result = "INFORMATION TEMPLATE";
        }

        return result;
    }
}
