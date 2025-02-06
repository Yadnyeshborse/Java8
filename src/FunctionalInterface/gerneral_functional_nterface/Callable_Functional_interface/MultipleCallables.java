package FunctionalInterface.gerneral_functional_nterface.Callable_Functional_interface;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

public class MultipleCallables {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(3);

        List<Callable<String>> tasks = Arrays.asList(
                () -> {
                    Thread.sleep(1000);
                    return "Task 1 completed";
                },
                () -> {
                    Thread.sleep(2000);
                    return "Task 2 completed";
                },
                () -> {
                    Thread.sleep(1500);
                    return "Task 3 completed";
                }
        );

        try {
            List<Future<String>> results = executor.invokeAll(tasks);

            for (Future<String> future : results) {
                System.out.println(future.get()); // Get result from each task
            }
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }

        executor.shutdown();
    }
}

