package com.dp.creational.simpleFactory;

/**
 * This class acts as a simple factory for creation of 
 * different posts on web site.
 *
 */
public class PostFactory {

    public static Post createPostFor(String type){
        switch (type){
            case "news" :
                return new NewsPost();
            case "blog":
                return new BlogPost();
            case "product":
                return new ProductPost();
            default:
                throw new IllegalArgumentException("invalid post type");
        }
    }

}
