package com.java.java11.structural.proxy.dynamic;

import com.java.java11.structural.proxy.Image;
import com.java.java11.structural.proxy.Point2D;


public class Client {

    public static void main(String[] args) {
        Image img = ImageFactory.getImage("A.bmp");
        img.setLocation(new Point2D(-10, 0));
        System.out.println(img.getLocation());
        System.out.println("*****************************");
        img.render();

    }
}
