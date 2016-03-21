package com.pillow.pattern.singleton;

public class SingletonInHolder {

    private static class Holder {
        static private SingletonInHolder instance = new SingletonInHolder();
    }

    private int internalValue = 859483;

    private SingletonInHolder() {
        for (int i = 0; i <= 2000000000; i++) internalValue *= i;
    }


    public static SingletonInHolder getInstance() {
        return Holder.instance;
    }

}
