package com.tts.creational;

public class SingletonClass {

    private String message = "hello from an instance!";
    private static final SingletonClass singletonClass = new SingletonClass();

    private SingletonClass(){

    }

    public static SingletonClass getInstance() {
        return singletonClass;
    }

    public String getMessage(){
        return message;
    }
}
