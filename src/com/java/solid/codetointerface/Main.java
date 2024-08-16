package com.java.solid.codetointerface;

import com.java.solid.codetointerface.entity.Engineer;

public class Main {

    public static void main(String[] args) {

        Engineer engineer = new Engineer(10l, 100);

        com.java.solid.codetointerface.CompensationAdjuster adjuster = new com.java.solid.codetointerface.CompensationAdjuster();

        adjuster.adjustCompensationByPercent(engineer, 5);
    }

}
