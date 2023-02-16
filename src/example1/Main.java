package example1;

public class Main {
    public static void main(String[] args) {
        Thread t1 = new HelloThread1(); // подкласс класса Thread
        // System.out.println(t1.getName());
        t1.start();
        //t1.run();

        Thread t2 = new Thread(new HelloThread2()); // передаем в конструктор Runnable
        //System.out.println(t2.getName());
        t2.start();

        // Можно переименовать имя потока передав его в конструктор
        Thread myThread = new Thread(new HelloThread2(), "my_thread");
        //System.out.println(myThread.getName());
        myThread.start();

        // Также можно сделать это с лямбда выражением
        Thread t3 = new Thread(() -> {
            System.out.println(String.format("Hello, i`m %s", Thread.currentThread().getName()));
        });
        t3.start();
        //t3.run(); // ?
    }
}