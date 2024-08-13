package com.java.java11.behavioral.mediator;

//Abstract colleague
public interface UIControl {

    void controlChanged(UIControl control);

    String getControlValue();

    String getControlName();
}
