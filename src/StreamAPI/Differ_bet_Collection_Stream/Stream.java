package StreamAPI.Differ_bet_Collection_Stream;

import java.util.ArrayList;
import java.util.List;

public class Stream<S> {
    public static void main(String[] args)
    {
        // Creating an empty Arraylist
        List<String> companyList = new ArrayList<>();

        // Adding elements to above ArrayList
        companyList.add("Google");
        companyList.add("Apple");
        companyList.add("Microsoft");

        // Sorting the list
        // using sorted() method and
        // printing using for-each loop
        companyList.stream().sorted().forEach(
                System.out::println);
    }
}
