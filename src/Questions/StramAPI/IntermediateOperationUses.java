package Questions.StramAPI;

import java.util.List;

public class IntermediateOperationUses {
    public static void main(String[] args) {
        List<Integer> list=List.of(5,2,1,7,8,94,2,3,1);
        System.out.println("Cube");
        list.stream().map(num->num*num*num).forEach(System.out::println);

        System.out.println("_________Sorted__________");
        list.stream().sorted().map(num->num*num*num).forEach(System.out::println);

        System.out.println("_________Distinct__________");
        list.stream().sorted().distinct().map(num->num*num*num).forEach(System.out::println);

        System.out.println("_________Less than 2000__________");
        list.stream().sorted().map(num->num*num*num).filter(num->num<2000).forEach(System.out::println);
    }
}
