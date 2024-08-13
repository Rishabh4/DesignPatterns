package com.java.java11.structural.proxy;


//Interface implemented by proxy and concrete objects
public interface Image {

    Point2D getLocation();

    void setLocation(Point2D point2d);

    void render();

}
