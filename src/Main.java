import java.util.ArrayList;
import java.util.Iterator;
import java.util.*;
import java.time.DayOfWeek;
import java.util.Objects;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws InterruptedException{
        HelloThread t = new HelloThread();
//        这是要给守护线程
         t.setDaemon(true);
        t.start();
        Thread.sleep(1);
        t.running = false; // 标志位置为false
    }
}
class HelloThread extends Thread {
//    volatile是线程间共享的关键字标记
    public volatile boolean running = true;
    public void run() {
        int n = 0;
        while (running) {
            n ++;
            System.out.println(n + " hello!");
        }
        System.out.println("end!");
    }
}
