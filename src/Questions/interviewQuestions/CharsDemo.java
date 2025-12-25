package Questions.interviewQuestions;

public class CharsDemo {
    public static void main(String[] args) {
        "abstribgz".chars().forEach(System.out::println);
        //.chars() is a method available on String objects that returns an
        // IntStream of Unicode code points of the characters in the string.


        //Since .chars() gives int, you often convert it back to char like this
        "strings".chars().mapToObj(i->(char) i).forEach(System.out::println);

    }
}
