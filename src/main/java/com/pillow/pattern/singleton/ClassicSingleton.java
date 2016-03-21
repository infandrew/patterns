package com.pillow.pattern.singleton;

import com.sun.swing.internal.plaf.synth.resources.synth;

public class ClassicSingleton {
    private static ClassicSingleton instance = null;

    private int internalValue = 52343;

    protected ClassicSingleton() {
        for (int i = 0; i <= 2000000000; i++) internalValue *= i;
    }

    public int getInternalValue() {
        return internalValue;
    }

    synchronized public static ClassicSingleton getInstance() {
       if(instance == null) {
          instance = new ClassicSingleton();
       }
       return instance;
    }
 }