package com.example.demo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Message {
    @JsonProperty("text_content")
    private String text;

    public Message(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
