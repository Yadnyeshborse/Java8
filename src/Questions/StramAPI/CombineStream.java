package Questions.StramAPI;

import java.util.Arrays;
import java.util.Optional;

public class CombineStream {
    public static void main(String[] args) {
        String[] array={"Geeks", "for", "Geeks"};
        Optional<String> result= Arrays.stream(array).reduce((str1,str2)->str1+"-"+str2);
        System.out.println(result);
    }
}
