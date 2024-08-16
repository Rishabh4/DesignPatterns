package com.java.patterns.creational.objectpool;


public class Client {

    public static final com.java.patterns.creational.objectpool.ObjectPool<Bitmap> bitmapPool = new com.java.patterns.creational.objectpool.ObjectPool<>(() -> new com.java.patterns.creational.objectpool.Bitmap("Logo.bmp"), 5);

    public static void main(String[] args) {
        com.java.patterns.creational.objectpool.Bitmap b1 = bitmapPool.get();
        b1.setLocation(new Point2D(10, 10));
        com.java.patterns.creational.objectpool.Bitmap b2 = bitmapPool.get();
        b2.setLocation(new Point2D(-10, 0));

        b1.draw();
        b2.draw();

        bitmapPool.release(b1);
        bitmapPool.release(b2);
    }
}
