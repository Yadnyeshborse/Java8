package Questions.Lambda;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

public class B {
    public static void main(String[] args) {

        ExecutorService executorService=Executors.newFixedThreadPool(1);

        List<Callable<String>> list= Arrays.asList(
                 ()->{
                    Thread.sleep(1000);
                    return "Thread 1 completed";
                 },
                ()->{
                     Thread.sleep(3000);
                     return "Thread 2 completed";
                },
                ()->{
                     Thread.sleep(6000);
                    return "Thraed 3 completed";
                }
        );

        try {
            List<Future<String>> futures=executorService.invokeAll(list);
            for (Future<String> list1:futures){
                System.out.println("Result="+ list1.get());
            }
        }catch (InterruptedException | ExecutionException e){
            e.printStackTrace();
        }
        executorService.shutdown();

    }
}
