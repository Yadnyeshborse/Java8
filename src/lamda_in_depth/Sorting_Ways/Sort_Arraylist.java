package lamda_in_depth.Sorting_Ways;

import java.util.ArrayList;
import java.util.Collections;

public class Sort_Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(201);
        list.add(102);
        list.add(98);
        list.add(203);
        System.out.println("Befor Sorting="+list);

        Collections.sort(list,(a,b)->(a>b)?-1:(a<b)?1:0);
        System.out.println("AfterSorting"+list);
    }
}
