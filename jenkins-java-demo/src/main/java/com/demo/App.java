package com.demo;

public class App {

    public static String greet(String name) {
        return "Hello, " + name + "! Jenkins + Maven + Java CI/CD is working!";
    }

    public static void main(String[] args) {
        System.out.println(greet("World"));
    }
}
