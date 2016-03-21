package com.pillow.pattern.singleton;

public class SingletonInStaticField {
    static SingletonInStaticField instatce = new SingletonInStaticField();

    private int internalValue = 12421;

    private SingletonInStaticField() {
        for (int i = 0; i <= 2000000000; i++) internalValue *= i;
    }

    public int getInternalValue() {
        return internalValue;
    }

    static SingletonInStaticField getInstance() {
        return instatce;
    }
}
