package FunctionalInterface.gerneral_functional_nterface.Callable_Functional_interface;

import java.util.concurrent.*;

public class CallableExample {
    public static void main(String[] args) {
        // Create an ExecutorService with a fixed thread pool of size 1
        ExecutorService executor = Executors.newFixedThreadPool(1);

        // Create a Callable task
        Callable<String> task = () -> {
            System.out.println("Task is running...");
            Thread.sleep(2000); // Simulate some work
            return "Hello from Callable!";
        };

        // Submit the task to the executor
        Future<String> future = executor.submit(task);

        try {
            // Wait for the result and print it
            System.out.println("Waiting for the result...");
            String result = future.get(); // This blocks until the result is available
            System.out.println("Result: " + result);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        } finally {
            // Shutdown the executor
            executor.shutdown();
        }
    }
}
