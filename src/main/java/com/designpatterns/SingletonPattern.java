package com.designpatterns;

/**
 * Double-check locking thread safe Singleton Pattern (C)
 * <p>
 * This pattern is used to create a singleton object that is thread-safe.
 * It uses double-check locking to ensure that only one instance of the singleton class is created.
 */
public class SingletonPattern {

    private static volatile SingletonPattern instance;

    private SingletonPattern() {
    }

    public static SingletonPattern getInstance() {
        if (instance == null) {
            synchronized (SingletonPattern.class) {
                if (instance == null) {
                    instance = new SingletonPattern();
                }
            }
        }
        return instance;
    }

    public static void main(String[] args) {
        System.out.println(SingletonPattern.getInstance());
    }
}
