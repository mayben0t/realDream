package third.world.demo.controller;

import java.util.concurrent.*;

/**
 * @Author WangXiao
 * @Description TODO
 * @Date 2019/2/12
 **/
public class Test {

    public static void main(String[] args) {
        ExecutorService pool = new ThreadPoolExecutor(3,10,10L, TimeUnit.SECONDS,
                new LinkedBlockingQueue<Runnable>(512));

        ExecutorService sta = Executors.newFixedThreadPool(200);
        sta.execute(
                new Runnable() {
                    @Override
                    public void run() {

                    }
                }
        );
    }
}
