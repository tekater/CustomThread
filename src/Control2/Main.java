package Control2;


public class Main {
    public static void main(String[] args) {
        Thread t1 = new WorkerThread("worker-X");
        Thread t2 = new WorkerThread("worker-Y");
        t1.start();
        t2.start();
    }
}
