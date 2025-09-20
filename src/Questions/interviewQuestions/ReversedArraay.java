package Questions.interviewQuestions;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ReversedArraay {
    public static void main(String[] args) {
        int arr[] = {2,4,6,1,3};
      int lp[]=IntStream.range(0,arr.length).map((i)->arr[arr.length-1-i]).toArray();
        System.out.println(Arrays.toString(lp));

    }
}

