package com.java.patterns.creational.simplefactory;

/**
 * Represents a product information post.
 */
public class ProductPost extends com.java.patterns.creational.simplefactory.Post {

    private String imageUrl;

    private String name;

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
