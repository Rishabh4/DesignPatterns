package com.java.patterns.creational.objectpool;

//Represents our abstract reusable
public interface Image extends com.java.patterns.creational.objectpool.Poolable {

    void draw();

    Point2D getLocation();

    void setLocation(Point2D location);
}
