package printonetohundread;

public class PrintNumberTask implements Runnable{
    private Integer noToPrint;

    public PrintNumberTask(Integer noToPrint) {
        this.noToPrint = noToPrint;
    }

    @Override
    public void run() {
        System.out.println("Number is: " + noToPrint + " thread name is: " +
                Thread.currentThread().getName());
    }
}
