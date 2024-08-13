package com.java.java8.behavioral.memento.command;

public interface WorkflowCommand {

    void execute();

    void undo();
}
