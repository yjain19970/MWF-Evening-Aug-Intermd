package producerconsumersemaphore;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.Semaphore;

public class Client {
    public static void main(String[] args) {
        Queue<Shirt> store = new ConcurrentLinkedDeque<>(); // store list
        int maxSizeOfStore = 20; //

        Semaphore semaphoreForProducer = new Semaphore(maxSizeOfStore);
        Semaphore semaphoreForConsumer = new Semaphore(0);


        // tailors
        Producer p1 = new Producer(store, maxSizeOfStore, "p1",semaphoreForProducer,semaphoreForConsumer);
        Producer p2 = new Producer(store, maxSizeOfStore, "p2",semaphoreForProducer,semaphoreForConsumer);
        Producer p3 = new Producer(store, maxSizeOfStore, "p3",semaphoreForProducer,semaphoreForConsumer);

        // customers
        Consumer c1 = new Consumer(store, "c1",semaphoreForProducer,semaphoreForConsumer);
        Consumer c2 = new Consumer(store, "c2",semaphoreForProducer,semaphoreForConsumer);
        Consumer c3 = new Consumer(store, "c3",semaphoreForProducer,semaphoreForConsumer);
        Consumer c4 = new Consumer(store, "c4",semaphoreForProducer,semaphoreForConsumer);

        new Thread(p1).start();
        new Thread(p2).start();
        new Thread(p3).start();

        new Thread(c1).start();
        new Thread(c2).start();
        new Thread(c3).start();
        new Thread(c4).start();

    }
}
