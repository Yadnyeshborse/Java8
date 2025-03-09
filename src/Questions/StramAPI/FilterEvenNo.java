package Questions.StramAPI;



import java.util.Arrays;
import java.util.stream.Stream;

public class FilterEvenNo {
    public static void main(String[] args) {
        Integer[] number={1,2,3,5,6,7,8,9,0};
        Stream<Integer> streamp=Arrays.stream(number);
        streamp.filter(o->o%2==0).forEach(System.out::println);
    }
}
