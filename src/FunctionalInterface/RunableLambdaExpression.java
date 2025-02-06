package FunctionalInterface;

class ThreadDemo implements Runnable{

    @Override
    public void run() {
        System.out.println("Runnable_example by traditional ways");
    }
}

//runnable is funtional al iteface
public class RunableLambdaExpression {
    public static void main(String[] args) {
        //traditional way
        Thread thread=new Thread(new ThreadDemo());
        thread.start();

        Runnable runnable=()->{
            System.out.println("Thred By Lambda Expresstions");
        };
        Thread thread1=new Thread(runnable);
        thread1.start();
    }
}
