package com.jdk.thread;


import java.util.Date;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ThreadDemo {
    public static void main(String[] args) {

        Thread thread = new Thread(print(), "t1");
        thread.start();

        Lock lock = new ReentrantLock();
        lock.lock();
        lock.unlock();

        //为每一个线程提供变量副本，隔离了多线程数据共享
        ThreadLocal threadLocal = new ThreadLocal();


    }

    public static Runnable print() {
        return () -> {
            for (int i = 1; i < 2; i++) {
                System.out.println("执行任务：" + new Date());
            }
        };
    }

}

