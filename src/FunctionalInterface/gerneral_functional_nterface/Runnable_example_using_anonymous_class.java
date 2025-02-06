package FunctionalInterface.gerneral_functional_nterface;


public class Runnable_example_using_anonymous_class{
    public static void main(String[] args) {
        //using anonymous class
        Runnable runnable=new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread is running>>>>>........");
            }
        };
        Thread thread=new Thread(runnable);
        thread.start();

        //using lambda expression
        Runnable task=()->{System.out.println("Thread is running by lamda expression");};
        new Thread(task).start();
    }
    
}
