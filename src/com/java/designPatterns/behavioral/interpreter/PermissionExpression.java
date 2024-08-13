package com.java.designPatterns.behavioral.interpreter;

//Abstract expression
public interface PermissionExpression {

    boolean interpret(User user);
}
