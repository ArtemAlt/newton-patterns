package org.example.newtonpatterns.service.util;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MessageTemplateCreatorTest {
    @Autowired
    private MessageTemplateCreator creator;

    @Test
    void createTemplateByCode1() {
        String template = creator.getTemplateByCode("1");
        Assertions.assertTrue(template.startsWith("HAPPY BIRTHDAY"));
    }

    @Test
    void createTemplateByCode2() {
        String template = creator.getTemplateByCode("2");
        Assertions.assertTrue(template.startsWith("WELCOME TEMPLATE"));
    }
    @Test
    void createTemplateByCode3() {
        String template = creator.getTemplateByCode("3");
        Assertions.assertTrue(template.startsWith("INFORMATION TEMPLATE"));
    }
    @Test
    void createTemplateByCode4() {
        Assertions.assertThrows(UnsupportedOperationException.class, () ->creator.getTemplateByCode("4"));
    }
}