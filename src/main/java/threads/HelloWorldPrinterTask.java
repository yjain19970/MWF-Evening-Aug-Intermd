package threads;

public class HelloWorldPrinterTask implements Runnable {
    @Override
    public void run() {
        System.out.println("Hello world... " + Thread.currentThread().getName());
    }
}
