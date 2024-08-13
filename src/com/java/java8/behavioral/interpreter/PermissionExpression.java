package com.java.java8.behavioral.interpreter;

//Abstract expression
public interface PermissionExpression {

    boolean interpret(User user);
}
