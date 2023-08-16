package threads;

public class Client {

    public static void main(String[] args) {

        System.out.println("Hello world from main... " + Thread.currentThread().getName());
        HelloWorldPrinterTask task = new HelloWorldPrinterTask();
        task.run();

        // create thread
        Thread t = new Thread(task);

        t.start();
        // HW: print 1-100 each in separate thread.
    }
}
