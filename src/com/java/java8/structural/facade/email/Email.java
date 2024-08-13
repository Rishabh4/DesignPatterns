package com.java.java8.structural.facade.email;

public class Email {

    public static EmailBuilder getBuilder() {
        return new EmailBuilder();
    }
}
