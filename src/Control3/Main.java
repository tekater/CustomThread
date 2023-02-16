package Control3;

public class Main {
    public static void main(String[] args) {
        Runnable t1 = new HelloThread();
        Runnable t2 = new HelloThread();

        Runnable[] run = {
                t1,t2
        };

        Starter.startRunnable(run);

    }
}