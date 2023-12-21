package org.example.newtonpatterns.service.model;

public record ApplicationMessage(String body) {

    @Override
    public String toString() {
        return "ApplicationMessage{" +
                "body='" + body + '\'' +
                '}';
    }
}
