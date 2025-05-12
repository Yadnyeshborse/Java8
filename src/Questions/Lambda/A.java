package Questions.Lambda;


import java.util.Arrays;
import java.util.List;

public class A {
    public static void main(String[] args) {

        List<Integer> list=Arrays.asList(205, 102, 98, 275, 203);
        list.sort((o1,o2)->Integer.compare(o2,o1));
        System.out.println(list);

    }
}
