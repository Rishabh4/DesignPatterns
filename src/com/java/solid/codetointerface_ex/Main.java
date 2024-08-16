package com.java.solid.codetointerface_ex;

import com.java.solid.codetointerface_ex.entity.User;

public class Main {

    public static void main(String[] args) {
        User user = new User();

        IdGenerator.generateId(user);

        System.out.println("User id " + user.getId());

    }

}
