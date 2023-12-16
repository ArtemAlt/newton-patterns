package org.example.newtonpatterns.service.componets;

import org.example.newtonpatterns.service.util.MessageTemplateCreator;
import org.springframework.beans.factory.annotation.Autowired;

public interface MessageTemplate {
    String getTemplate();
    String currentCode();
    @Autowired
    default void registerMyself( MessageTemplateCreator creator) {
        creator.registry(this);
    }
}
