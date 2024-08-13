package com.java.java8.structural.facade.email;

public class StationaryFactory {

    public static Stationary createStationary() {
        return new HalloweenStationary();
    }
}
