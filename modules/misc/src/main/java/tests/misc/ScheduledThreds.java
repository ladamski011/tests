package tests.misc;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledThreds {

    public static void main(String[] args) {
        ScheduledExecutorService scheduledExecutor = Executors.newScheduledThreadPool(4);
        scheduledExecutor.schedule(new DelayedPrinter(scheduledExecutor), 1, TimeUnit.SECONDS);


    }

    static class DelayedPrinter implements Runnable {
        private ScheduledExecutorService scheduledExecutor;

        public DelayedPrinter(ScheduledExecutorService scheduledExecutor) {
            this.scheduledExecutor = scheduledExecutor;
        }

        @Override
        public void run() {
            System.out.println("Printing!");
            scheduledExecutor.schedule(new DelayedPrinter(scheduledExecutor), 1, TimeUnit.SECONDS);
        }
    }
}
