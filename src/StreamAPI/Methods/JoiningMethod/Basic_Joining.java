package StreamAPI.Methods.JoiningMethod;

import java.util.List;
import java.util.stream.Collectors;

public class Basic_Joining {
    public static void main(String[] args) {
        List<String> str=List.of("Raj","Patil","Yuva");
        String result=str.stream().collect(Collectors.joining());
        System.out.println(result);
    }
}
