package com.test.tga.creational.prototype;

public class General extends GameUnit{

    private String state = "idle";

    private void boostMorale() {
        this.state = "MoralBoost";
    }

    @Override
    public String toString() {
        return "Swordsman " + state + " @ " + getPosition();
    }

    @Override
    public GameUnit clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("Generals are unique");
    }

    @Override
    protected void reset() {
        throw new UnsupportedOperationException("Reset not supported");
    }
}
