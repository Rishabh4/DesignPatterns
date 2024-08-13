package com.java.java8.creational.abstractFactory;

public interface ResourceFactory {

    Instance createInstance(Instance.Capacity capacity);

    Storage createStorage(int capMib);

}
