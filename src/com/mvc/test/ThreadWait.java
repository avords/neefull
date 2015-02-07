package com.mvc.test;

import java.util.concurrent.CountDownLatch;

public class ThreadWait {

    public static void main(String[] args){
        CountDownLatch cd = new CountDownLatch(10);
        for(int i=0;i<10;i++){
            ThreadDemo1 t = new ThreadDemo1(cd);
            t.start();
        }
        try {
            cd.await();
        } catch (Exception e) {
            System.out.println("异常");
            e.printStackTrace();
        }
        System.out.println("--------------------主线程结束了！-------------------------");
    }
}
