package lamda_in_depth;

import java.util.ArrayList;

public class Check_if_even_no {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(2);
        list.add(4);
        list.add(7);
        list.add(12);

        System.out.println("Iterating Element");
        list.forEach(i->System.out.println(i));

        System.out.println("Even no");
        list.forEach((i)->{
            if (i%2==0){
                System.out.println(i);
            }
        });
    }
}
