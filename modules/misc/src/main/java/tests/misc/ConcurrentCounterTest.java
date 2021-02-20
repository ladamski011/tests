package tests.misc;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class ConcurrentCounterTest {
    public static void main(String[] arg) {
        Counter counter = new Counter();
        Executor executor = Executors.newFixedThreadPool(20);

        for (int i = 0; i < 100; i++) {
            executor.execute(new IntModificationTask(counter));
        }
    }
}
