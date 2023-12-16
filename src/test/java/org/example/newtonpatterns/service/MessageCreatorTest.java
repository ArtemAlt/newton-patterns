package org.example.newtonpatterns.service;

import org.example.newtonpatterns.service.model.ApplicationMessage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class MessageCreatorTest {
    @Autowired
    private MessageCreator messageCreator;

    @Test
    void createMsg1() {
        ApplicationMessage msg = messageCreator.createMsg("1", "IVAN IVANOV");
        Assertions.assertTrue(msg.getBody().startsWith("HAPPY BIRTHDAY"));
    }
    @Test
    void createMsg2() {
        ApplicationMessage msg = messageCreator.createMsg("2", "IVAN IVANOV");
        Assertions.assertTrue(msg.getBody().startsWith("WELCOME TEMPLATE"));
    }
    @Test
    void createMsg3() {
        ApplicationMessage msg = messageCreator.createMsg("3", "IVAN IVANOV");
        Assertions.assertTrue(msg.getBody().startsWith("INFORMATION TEMPLATE"));
    }
    @Test
    void createMsg4() {
        ApplicationMessage msg = messageCreator.createMsg("4", "IVAN IVANOV");
        Assertions.assertTrue(msg.getBody().startsWith("INFORMATION TEMPLATE"));
    }
}