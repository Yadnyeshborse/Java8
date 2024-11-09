package pre_defined_functional_interface;

import java.util.function.BiPredicate;

public class BiPredicateExample {
    public static void main(String[] args) {
        BiPredicate<String,String> biPredicate=((value1, value2)->value1.equals(value2));
            System.out.println(biPredicate.test("A","B"));

            BiPredicate<Integer,Integer> biPredicate1=((Inte,Inte2)->Inte>Inte2 );
            BiPredicate<Integer,Integer> biPredicate2=((Inteee,Inteee2)->Inteee==Inteee2);
            Boolean res=biPredicate1.and(biPredicate2).test(10,10);
            System.out.println(res);
    }
}
