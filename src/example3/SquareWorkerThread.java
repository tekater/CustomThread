package example3;

public class SquareWorkerThread extends Thread{
    public SquareWorkerThread(String name) {
        super(name);
    }
    @Override
    public void run() {
        while(true) {
            System.out.println("Введите число:");
            int number = new java.util.Scanner(System.in).nextInt();
            if(number == 0) {
                break;
            }
            System.out.println("Ваше число в квадрате: " + number * number);
        }
        System.out.println(String.format("%s finished", getName()));
    }
}
