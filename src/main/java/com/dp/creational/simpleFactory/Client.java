package com.dp.creational.simpleFactory;

public class Client {

    public static void main(String[] args) {
        Post newsPost = PostFactory.createPostFor("news");
        System.out.println(newsPost);
        Post blogPost = PostFactory.createPostFor("blog");
        System.out.println(blogPost);
        Post productPost = PostFactory.createPostFor("product");
        System.out.println(productPost);
    }
}
