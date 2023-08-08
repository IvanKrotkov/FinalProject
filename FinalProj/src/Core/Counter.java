package Core;

public class Counter implements AutoCloseable{
    private int count = 0;
    private Status status;
    public void add(){
        count++;
    }

    public Counter(){
        this.status = Status.ON;
    }

    @Override
    public void close() throws Exception {
        this.status = Status.OFF;
    }
    enum Status{
        ON,OFF;
    }
}
