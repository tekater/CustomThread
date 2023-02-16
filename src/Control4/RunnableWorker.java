package Control4;

public class RunnableWorker extends Thread implements Runnable{
    public RunnableWorker(String name) {
        super(name);
    }
    @Override
    public void run(){
        final String name = Thread.currentThread().getName();
        if(name.startsWith("worker-")){
            System.out.println("too hard calculations...");
        }else {
            System.out.println("not found worker-");
        }
    }
}
