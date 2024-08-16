package com.java.patterns.creational.simplefactory;

/**
 * This class acts as a simple factory for creation of
 * different posts on web site.
 */
public class PostFactory {

    public static com.java.patterns.creational.simplefactory.Post createPost(String type) {
        switch (type) {
            case "blog":
                return new com.java.patterns.creational.simplefactory.BlogPost();
            case "news":
                return new com.java.patterns.creational.simplefactory.NewsPost();
            case "product":
                return new com.java.patterns.creational.simplefactory.ProductPost();
            default:
                throw new IllegalArgumentException("Post type is unown");
        }
    }

}
