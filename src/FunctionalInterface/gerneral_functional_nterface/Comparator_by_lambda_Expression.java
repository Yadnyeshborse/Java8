package FunctionalInterface.gerneral_functional_nterface;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Comparator_by_lambda_Expression{
    public static void main(String[] args) {
        List<String> list= Arrays.asList("Manish","Aaru","Kety");

        Collections.sort(list,(s1,s2)->s1.compareTo(s2));
        System.out.println(list);
    }


    
}
