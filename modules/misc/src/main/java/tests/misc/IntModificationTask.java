package tests.misc;

public class IntModificationTask implements Runnable {
    private Counter counterCopy;

    public IntModificationTask(Counter counterCopy) {
        this.counterCopy = counterCopy;
    }

/*    public void run() {
        try {
            Thread.sleep(ThreadLocalRandom.current().nextLong(10_000));
            synchronized (this) {
                System.out.println(counterCopy.increaseAndGet());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }*/

    public void run() {
        System.out.println(counterCopy.increaseAndGet());
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
