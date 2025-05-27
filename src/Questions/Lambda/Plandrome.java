package Questions.Lambda;


import java.util.stream.Stream;

public class Plandrome {
    public static void main(String[] args) {
        // create a string array
        String[] myArray
                = new String[] { "madam", "please", "refer",
                "link",  "on",     "racecar" };
        Stream.of(myArray).filter(o->isPlaindrome(o)).forEach(System.out::println);
    }

    private static boolean isPlaindrome(String str) {
        if (str.length()==1){
            return true;
        }else {
            return str.charAt(0)==str.charAt(str.length()-1) && isPlaindrome(str.substring(1,str.length()-1));
        }
    }
}
