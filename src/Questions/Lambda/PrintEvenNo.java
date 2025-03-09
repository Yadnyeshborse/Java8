package Questions.Lambda;

import java.util.ArrayList;

public class PrintEvenNo {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        list.forEach((i)->System.out.println(i));
        System.out.println("Print Even No");
        list.forEach((i)->{
            if (i%2==0){System.out.println(i);}
        });
    }
}
