package StreamAPI.FilterExamAndType;

import java.util.stream.Stream;

public class CustomFilter {
    public static void filterBy() {

        // create a string array
        String[] myArray
                = new String[] { "madam", "please", "refer",
                "link",  "on",     "racecar" };

        Stream.of(myArray).filter(x->plaindrome(x)).forEach(System.out::println);


    }

    private static boolean plaindrome(String s) {
        if (s.length()==1){
            return true;
        }else {
            return (s.charAt(0)==s.charAt(s.length()-1)) && plaindrome(s.substring(1,s.length()-1));
        }
    }

    public static void main(String[] args) {
        filterBy();
    }


}
