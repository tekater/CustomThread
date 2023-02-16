package Control3;

public class HelloThread implements Runnable{
    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();
        String helloMsg = String.format("Hello i`m %s", threadName);
        System.out.println(helloMsg);
    }
}
