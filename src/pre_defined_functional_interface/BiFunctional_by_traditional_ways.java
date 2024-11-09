package pre_defined_functional_interface;

import java.util.function.BiFunction;

public class BiFunctional_by_traditional_ways implements BiFunction<Integer,Integer,Integer> {
    @Override
    public Integer apply(Integer integer, Integer integer2) {
        return (integer+integer2);
    }

    public static void main(String[] args) {
        BiFunction<Integer,Integer,Integer> biFunction=new BiFunctional_by_traditional_ways();
        System.out.println(biFunction.apply(2,4));
    }
}
