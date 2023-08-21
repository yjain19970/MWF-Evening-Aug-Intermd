package addsubmutex;

import java.util.concurrent.locks.Lock;

public class Adder implements Runnable {
    private Count count;
    private Lock lock;

    public Adder(Count count, Lock lock) {
        this.count = count;
        this.lock = lock;
    }


    @Override
    public void run() {
        for (int i = 1; i <= 10000; ++i) {
            System.out.println("ADDER IS TAKING LOCK..."+ Thread.currentThread().getName());
            lock.lock();
            count.value += i;
            System.out.println("ADDER IS RELEASING LOCK...");
            lock.unlock();
        }
    }
}