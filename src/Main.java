import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.concurrent.*;

/**
 * Learn Java from https://www.liaoxuefeng.com/
 *
 * @author liaoxuefeng
 */
public class Main {
    public static void main(String[] args) throws Exception {
        ExecutorService es = Executors.newFixedThreadPool(4);
        Future<BigDecimal> future = es.submit(new Task("601857"));
//        获取future结果
        System.out.println(future.get()+"0000"+future.isDone());
//       获取结果，但是等待指定时间
//        System.out.println(future.get(100, TimeUnit.SECONDS));
        future.cancel(true);
        System.out.println(future.get()+"1111111111"+future.isDone());
        es.shutdown();
        System.out.println(future.get()+"222222222"+future.isDone());
        if (es.isShutdown()){
            System.out.println("end----");
        }
    }
}

class Task implements Callable<BigDecimal> {

    public Task(String code) {
    }

    @Override
    public BigDecimal call() throws Exception {
        Thread.sleep(1000);
        double d = 5 + Math.random() * 20;
        return new BigDecimal(d).setScale(2, RoundingMode.DOWN);
    }
}
