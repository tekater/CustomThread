package Control4;

public class Main {
    public static void main(String[] args) {
        // Первый вариант
        RunnableWorker t1 = new RunnableWorker("worker-1");
        t1.start();
        RunnableWorker t2 = new RunnableWorker("no worker");
        t2.start();

        // Второй вариант
        Thread t3 = new Thread(new RunnableWorker2(),"worker-");
        t3.start();
    }
}
