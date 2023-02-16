package example1;

public class HelloThread1 extends Thread{
    // в Java есть два основных метода для создания нового потока
    // который выполняет задачу которую вы решаете

    // 1. Используем класс Thread и переписываем метод run

    @Override
    public void run() {
        String helloMsg = String.format("Hello, I'm %s", getName());
        System.out.println(helloMsg);
    }
}
