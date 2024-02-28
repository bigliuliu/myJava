import java.util.ArrayList;
import java.util.Iterator;
import java.util.*;
import java.time.DayOfWeek;
import java.util.Objects;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("main class is running");
//        学习线程
//        创建一个线程1
//        Thread t = new MyThread();
//        2
//        Thread t = new Thread(new MyRunnable());
//        3
        Thread t = new Thread(()->{
            System.out.println("third new thread");
            try{
                Thread.sleep(10);
            }
            catch (InterruptedException e){}
            System.out.println("third end");
        });
//        设定线程优先级
        t.setPriority(1);
        t.start();// 启动新线程
        try{
            Thread.sleep(10);
        }
        catch (InterruptedException e){}
        System.out.println("main ending");
    }
}
class MyThread extends Thread{
    @Override
    public void run(){
        System.out.println("starting new thread!");
    }
}
class MyRunnable implements Runnable{
    @Override
    public void run(){
        System.out.println("this is new thread");
    }
}