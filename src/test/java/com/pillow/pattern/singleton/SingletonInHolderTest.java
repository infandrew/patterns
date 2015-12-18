package com.pillow.pattern.singleton;

import java.util.stream.IntStream;

import org.testng.annotations.Test;

@Test
public class SingletonInHolderTest {

    public void singleBadTest() {
        IntStream.rangeClosed(0, 10).parallel().forEach(
            nbr -> System.out.println(SingletonBad.getInstance().hashCode())
        );
        System.out.println();
    }
    
    public void simpleTest() {
        IntStream.rangeClosed(0, 10).parallel().forEach(
            nbr -> System.out.println(ClassicSingleton.getInstance().hashCode())
        );
        System.out.println();
    }
    
    public void holderTest() {        
        IntStream.rangeClosed(0, 10).parallel().forEach(
            nbr -> System.out.println(SingletonInHolder.getInstance().hashCode())
        );
        System.out.println();
    }
    
    //SingletonInHolder single = SingletonInHolder.getInstance();
    
    /*Runnable task = () -> {
        String threadName = Thread.currentThread().getName();
        System.out.println("Hello " + threadName);
    };*/

    //SingletonInHolderTest a = new SingletonInHolderTest();
    //a.equals(a);
    //equals(new Object());
    
    //new Thread(task).start()    
}
