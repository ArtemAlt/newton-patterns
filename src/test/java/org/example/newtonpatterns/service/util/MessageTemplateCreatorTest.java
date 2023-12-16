package org.example.newtonpatterns.service.util;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

class MessageTemplateCreatorTest {
    private MessageTemplateCreator creator = new MessageTemplateCreator();

    @Test
    void createTemplateByCode1() {
        String template = creator.createTemplateByCode("1");
        Assertions.assertTrue(template.startsWith("HAPPY BIRTHDAY"));
    }

    @Test
    void createTemplateByCode2() {
        String template = creator.createTemplateByCode("2");
        Assertions.assertTrue(template.startsWith("WELCOME TEMPLATE"));
    }
    @Test
    void createTemplateByCode3() {
        String template = creator.createTemplateByCode("3");
        Assertions.assertTrue(template.startsWith("INFORMATION TEMPLATE"));
    }
    @Test
    void createTemplateByCode4() {
        String template = creator.createTemplateByCode("4");
        Assertions.assertFalse(template.startsWith("HAPPY BIRTHDAY"));
    }
}