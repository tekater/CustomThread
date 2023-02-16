package Control3;

public class Starter extends HelloThread{
    public static void startRunnable(Runnable[] runnable) {
        for (int i = 0; i < runnable.length; i++) { // можно использовать for (Runnable value : runnable) {
            Thread a = new Thread(runnable[i]);
            a.start();
        }
    }
}
