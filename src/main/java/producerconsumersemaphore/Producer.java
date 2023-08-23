package producerconsumersemaphore;

import java.util.Queue;
import java.util.concurrent.Semaphore;

public class Producer implements Runnable {
    private Queue<Shirt> store;
    private int maxSizeOfStore;
    private String name;
    private Semaphore semaphoreForProducer;
    private Semaphore semaphoreForConsumer;


    public Producer(Queue<Shirt> store, int maxSizeOfStore, String name,
                    Semaphore semaphoreForProducer,
                    Semaphore semaphoreForConsumer) {
        this.store = store;
        this.maxSizeOfStore = maxSizeOfStore;
        this.name = name;
        this.semaphoreForConsumer = semaphoreForConsumer;
        this.semaphoreForProducer = semaphoreForProducer;
    }

    @Override
    public void run() {
        while(true){
            try {
                semaphoreForProducer.acquire(); // decrementing producer
                store.add(new Shirt());
                System.out.println(name + " produced. Left shirt count " + store.size());
                semaphoreForConsumer.release(); // incrementing consumer


            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
