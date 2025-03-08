package lamda_in_depth.Thread;

public class ThradImp {
    public static void main(String[] args) {
        Runnable myThread=()->{
            Thread.currentThread().setName("Thread1");
            System.out.println(Thread.currentThread().getName()+" is running");

        };
        Thread thread=new Thread(myThread);
        thread.start();
    }
}
