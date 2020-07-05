package com.sample.app;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;

@Execution(ExecutionMode.CONCURRENT)
public class ParallelTestDemo {
	
	private static int TIME_TO_SLEEP = 5000;
	
    @Test
    void test1() throws InterruptedException {
        Thread.sleep(TIME_TO_SLEEP);
        System.out.println("Test1: " + Thread.currentThread().getName());
    }

    @Test
    void test2() throws InterruptedException {
        Thread.sleep(TIME_TO_SLEEP);
        System.out.println("Test2: " + Thread.currentThread().getName());
    }
    
    @Test
    void test3() throws InterruptedException {
        Thread.sleep(TIME_TO_SLEEP);
        System.out.println("Test3: " + Thread.currentThread().getName());
    }
    
    
    @Test
    void test4() throws InterruptedException {
        Thread.sleep(TIME_TO_SLEEP);
        System.out.println("Test4: " + Thread.currentThread().getName());
    }
    
    @Test
    void test5() throws InterruptedException {
        Thread.sleep(TIME_TO_SLEEP);
        System.out.println("Test5: " + Thread.currentThread().getName());
    }
}
