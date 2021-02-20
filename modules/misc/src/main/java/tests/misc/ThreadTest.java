package tests.misc;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadTest {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(4);

        Counter counter = new Counter();

        for (int i = 0; i<5; i++) {
            executor.submit(counter);
        }

        System.exit(0);
    }

    static class Counter implements Runnable {
        int counter = 0;

        public void run() {
            System.out.print(counter);
            counter++;
        }
    }
}
