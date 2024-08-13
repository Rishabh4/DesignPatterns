package com.java.java11.structural.facade.email;

public class Email {

    public static EmailBuilder getBuilder() {
        return new EmailBuilder();
    }
}
