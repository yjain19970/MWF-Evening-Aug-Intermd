package syncmethods;

public class Count { // library class.
    private int value=0;

    public synchronized void incrementValue(int offset){
        this.value +=offset;
    }

    public synchronized void decreament(int offset){
        this.value -=offset;
    }

    public int getValue(){
        return this.value;
    }
}
