package com.mvc.test;

import java.util.concurrent.CountDownLatch;

public class ThreadDemo1 extends Thread{

    private final  CountDownLatch cd;
    public ThreadDemo1(CountDownLatch cd){
        this.cd = cd;
    }
    @Override
    public void run(){
        for(int i=1;i<=10;i++){
            System.out.println(Thread.currentThread().getName()+":"+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(cd.getCount());
        cd.countDown();
    }
}
