package FunctionalInterface.Function.Consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Example2_handel_exceptioj {
    public static void main(String[] args) {
        Consumer<List<Integer>> consumer1=(input)->input.replaceAll(x->x*2);
        Consumer<List<Integer>> display=(input)->input.forEach(l->System.out.println(l));
        List<Integer> li= Arrays.asList(9,8,7,6,5);
        //handel exceptions now
        try {
            consumer1.andThen(null).accept(li);
        }catch (NullPointerException e){
            System.out.println("Null pointer exception "+e.getMessage());
        }catch (Exception e){
            System.out.println(e);
        }

    }
}
