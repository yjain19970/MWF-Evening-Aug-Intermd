package printonetohundread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ClientWithExecutor {
    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(50); // 50 threads/

        for(int i=0;i<1000;i++){
            PrintNumberTask task = new PrintNumberTask(i);

            if(i==200){
                System.out.println("break...");
            }
            es.submit(task);
        }

        es.shutdown(); //

    }
}
