package com.mvc.test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPool {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        for(int i=0;i<100;i++){
            ThreadDemo t = new ThreadDemo();
            executorService.submit(t);
        }
        System.out.println("--------------------主线程结束了！-------------------------");
    }
}
