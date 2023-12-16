package org.example.newtonpatterns.service.model;

public class ApplicationMessage {
    private final String body;

    public ApplicationMessage(String body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return "ApplicationMessage{" +
                "body='" + body + '\'' +
                '}';
    }

    public String getBody() {
        return body;
    }
}
