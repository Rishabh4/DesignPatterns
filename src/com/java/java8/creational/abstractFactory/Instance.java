package com.java.java8.creational.abstractFactory;

public interface Instance {
    void start();

    void attachStorage(Storage storage);

    void stop();

    enum Capacity {micro, small, large}
}
