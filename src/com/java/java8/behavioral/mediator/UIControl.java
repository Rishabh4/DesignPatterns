package com.java.java8.behavioral.mediator;

//Abstract colleague
public interface UIControl {

    void controlChanged(UIControl control);

    String getControlValue();

    String getControlName();
}
