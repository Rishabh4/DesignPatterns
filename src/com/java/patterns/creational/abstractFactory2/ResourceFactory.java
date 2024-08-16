package com.java.patterns.creational.abstractfactory2;

//Abstract factory with methods defined for each object type.
public interface ResourceFactory {

    Instance createInstance(com.java.patterns.creational.abstractfactory2.Instance.Capacity capacity);

    com.java.patterns.creational.abstractfactory2.Storage createStorage(int capMib);
}
