package com.pillow.pattern.singleton;

public class SingletonInHolder {

    private static class Holder {
        static private SingletonInHolder instance = new SingletonInHolder();
    }

    
    private SingletonInHolder() {

    }

    
    public static SingletonInHolder getInstance() {
        return Holder.instance;
    }

}
