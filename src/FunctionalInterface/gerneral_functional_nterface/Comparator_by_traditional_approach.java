package FunctionalInterface.gerneral_functional_nterface;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Comparator_by_traditional_approach {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("Shamu","Manu","Aashu");

        Comparator<String> comparator=new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        };
        Collections.sort(list,comparator);
        System.out.println(list);
    }
}

