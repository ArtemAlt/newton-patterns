package org.example.newtonpatterns.service;

import org.example.newtonpatterns.service.model.ApplicationMessage;
import org.example.newtonpatterns.service.util.MessageTemplateCreator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

@SpringBootTest(classes = MessageCreator.class)
class MessageCreatorTest {
    @Autowired
    private MessageCreator messageCreator;
    @MockBean
    private MessageTemplateCreator templateCreator;

    @Test
    void createMsg1() {
        Mockito.when(templateCreator.getTemplateByCode("1")).thenReturn("HAPPY BIRTHDAY TEMPLATE");
        ApplicationMessage msg = messageCreator.createMsg("1", "IVAN IVANOV");
        Assertions.assertTrue(msg.body().startsWith("HAPPY BIRTHDAY"));
    }
    @Test
    void createMsg2() {
        Mockito.when(templateCreator.getTemplateByCode("2")).thenReturn("WELCOME TEMPLATE");
        ApplicationMessage msg = messageCreator.createMsg("2", "IVAN IVANOV");
        Assertions.assertTrue(msg.body().startsWith("WELCOME TEMPLATE"));
    }
    @Test
    void createMsg3() {
        Mockito.when(templateCreator.getTemplateByCode("3")).thenReturn("INFORMATION TEMPLATE");
        ApplicationMessage msg = messageCreator.createMsg("3", "IVAN IVANOV");
        Assertions.assertTrue(msg.body().startsWith("INFORMATION TEMPLATE"));
    }
    @Test
    void createMsg4() {
        Mockito.when(templateCreator.getTemplateByCode("4")).thenReturn("");
        ApplicationMessage msg = messageCreator.createMsg("4", "IVAN IVANOV");
        Assertions.assertFalse(msg.body().startsWith("INFORMATION TEMPLATE"));
    }
}