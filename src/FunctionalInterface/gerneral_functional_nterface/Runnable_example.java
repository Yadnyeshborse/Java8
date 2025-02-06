package FunctionalInterface.gerneral_functional_nterface;

public class Runnable_example {
    private class Dummy implements Runnable{

        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName()+" "+"Excuting Curent Thread");

        }
    }

    public static void main(String[] args) {
        System.out.println("Main Method = >"+Thread.currentThread().getName());

        Thread t1=new Thread(new Runnable_example().new Dummy());
        t1.start();
    }
}

