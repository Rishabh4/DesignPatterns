package com.java.designPatterns.behavioral.memento.command;

public interface WorkflowCommand {

    void execute();

    void undo();
}
