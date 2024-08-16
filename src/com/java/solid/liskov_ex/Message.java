package com.java.solid.liskov_ex;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class Message {

    protected String content;

    public Message(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public String getEncodedMessage() {
        if (content == null) {
            return null;
        }
        return Base64.getEncoder().encodeToString(content.getBytes(StandardCharsets.UTF_8));
    }

    @Override
    public String toString() {
        return "Message [content=" + content + "]";
    }

}
