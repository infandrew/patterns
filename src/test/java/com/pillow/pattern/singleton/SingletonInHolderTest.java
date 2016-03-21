package com.pillow.pattern.singleton;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.IntStream;

import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class SingletonInHolderTest {

    public void singleBadTest() {
        IntStream.rangeClosed(0, 10).parallel().forEach( nbr -> {
            Integer hash = SingletonInStaticField.getInstance().hashCode();
            System.out.println(hash + " " + nbr);
        });
    }

    public void simpleTest() {
        IntStream.rangeClosed(0, 10).parallel().forEach(
            nbr -> System.out.println(ClassicSingleton.getInstance().hashCode()+" "+nbr)
        );
    };

    public void holderTest() {
        IntStream.rangeClosed(0, 10).parallel().forEach(
            nbr -> System.out.println(SingletonInHolder.getInstance().hashCode()+" "+nbr)
        );
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
