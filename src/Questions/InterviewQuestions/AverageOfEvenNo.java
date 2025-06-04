package Questions.InterviewQuestions;

import java.util.*;

public class AverageOfEvenNo {
    public static void main(String[] args) {
        //find average of even no
        List<Integer> list= Arrays.asList(2,4,6,1,3);


        OptionalDouble result=list.stream().filter(i->i%2==0).mapToInt(integer -> integer.intValue()).average();
        if(result.isPresent()){
            System.out.println(result.getAsDouble());
        }
        //We use .mapToInt(Integer::intValue) to convert a Stream<Integer> to an IntStream, which is necessary when you want to perform numeric operations like:
        //
        //sum()
        //
        //average()
        //
        //min(), max()
        //
        //summaryStatistics()

        List<List<Integer>> listp = new ArrayList<>();
        listp.add(Arrays.asList(9, 2));
        listp.add(Arrays.asList(4, 3));
        listp.add(Arrays.asList(5, 6));
        listp.add(Arrays.asList(7, 8));
        System.out.println(listp);



        //sort array of array
        List<Integer> list1=listp.stream().flatMap((i)->i.stream()).sorted(Comparator.naturalOrder()).toList();
        System.out.println(list1);
    }
}
