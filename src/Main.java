package com.itranswarp.learnjava;

import java.util.concurrent.*;

/**
 * Learn Java from https://www.liaoxuefeng.com/
 *
 * @author liaoxuefeng
 */
public class Main {
    public static void main(String[] args) {
//        创建固定的四个线程
//        ExecutorService es = Executors.newFixedThreadPool(4);
//        指定动态范围的线程池
//        int min =4;
//        int max = 10;
//        ExecutorService es = new ThreadPoolExecutor(min,max,60L, TimeUnit.SECONDS,new SynchronousQueue<Runnable>());
//        创建定时器线程池
        ScheduledExecutorService es = Executors.newScheduledThreadPool(4);
//        1s 后执行一次任务
//        es.schedule(new Task("one-time"),1,TimeUnit.SECONDS);
//        2s后开始执行定时任务，每3s执行
//        es.scheduleAtFixedRate(new Task("fixed-rate"),2,3,TimeUnit.SECONDS);
//        2s后开始执行定时任务，以3s为间隔执行
        es.scheduleWithFixedDelay(new Task("fixed-delay"),2,3,TimeUnit.SECONDS);
        for (int i = 0; i < 6; i++) {
            es.submit(new Task("" + i));
        }
        es.shutdown();
    }
}

class Task implements Runnable {

    private final String name;

    public Task(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("start task " + name);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
        }
        System.out.println("end task " + name);
    }
}
