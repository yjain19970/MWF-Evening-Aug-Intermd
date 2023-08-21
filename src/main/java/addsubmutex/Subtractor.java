package addsubmutex;

import java.util.concurrent.locks.Lock;

public class Subtractor implements Runnable {
    private Count count;
    private Lock lock;

    public Subtractor(Count count, Lock lock) {
        this.count = count;
        this.lock = lock;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10000; ++i) {
            System.out.println("SUB IS TAKING LOCK..." + Thread.currentThread().getName());
            lock.lock();
            this.count.value -= i;
            System.out.println("SUB IS TAKING LOCK...");
            lock.unlock();
        }
    }
}

