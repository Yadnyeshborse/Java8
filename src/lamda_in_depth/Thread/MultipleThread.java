package lamda_in_depth.Thread;

public class MultipleThread {
    public static void main(String[] args) {
        Runnable runnable=()->{
            String name=Thread.currentThread().getName();
            System.out.println("The thread running is ="+name);

        };
        Thread thread=new Thread(runnable);
        Thread thread1=new Thread(runnable);
        thread.start();
        thread1.start();
    }
}
