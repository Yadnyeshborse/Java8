package FunctionalInterface.Types.Consumer.BiConsumer;

import java.util.function.BiConsumer;

public class Increment_array {
    public static void main(String[] args) {
        int[] a={6};
        int[] b={4};

        BiConsumer<int[],int[]> result=(arr1,arr2)->{
            arr1[0]++;
            arr2[0]++;
        };

        result.accept(a,b);
        System.out.println(a[0]+" "+b[0]);
    }
}
