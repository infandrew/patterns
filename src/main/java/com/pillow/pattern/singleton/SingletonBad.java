package com.pillow.pattern.singleton;

public class SingletonBad {
    static SingletonBad instatce = new SingletonBad();

    private SingletonBad() {
    }

    static SingletonBad getInstance() {
        return instatce;
    }
}
