package Runnable_interface_using_traditional_vs_lambda;

class ThreadDemo implements Runnable{

    @Override
    public void run() {
        System.out.println("Thread Method Called......");
    }
}


public class Thread_using_lambda_traditional_approach {
    public static void main(String[] args) {
        //traditional approoach
        Thread thread=new Thread(new ThreadDemo());
        thread.start();


        //using lamba expresstion
        Runnable runnable = () -> {
            System.out.println("Called thread using lambda expression");
        };
        Thread lambdaThread = new Thread(runnable);
        lambdaThread.start();
    }


}
