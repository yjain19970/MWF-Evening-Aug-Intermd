package printonetohundread;

public class Client {

    public static void main(String[] args) {
        System.out.println("Main thread is: " + Thread.currentThread().getName());
        // 1000 threads.
        for(int i=0;i<1000;i++){
            PrintNumberTask task = new PrintNumberTask(i);
            if(i==100){
                System.out.println("BREAK");
            }
            Thread t = new Thread(task);
            t.start();
        }
    }
}
