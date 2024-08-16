package com.java.patterns.creational.simplefactory;

public class Client {

    public static void main(String[] args) {
        com.java.patterns.creational.simplefactory.Post post = com.java.patterns.creational.simplefactory.PostFactory.createPost("news");
        System.out.println(post);

    }

}
