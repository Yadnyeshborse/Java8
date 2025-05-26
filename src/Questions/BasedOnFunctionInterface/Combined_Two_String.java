package Questions.BasedOnFunctionInterface;

import java.util.function.BiConsumer;

public class Combined_Two_String {
    public static void main(String[] args) {
        BiConsumer<String,String> result=(s1,s2)->{
            System.out.println(s1+" "+s2);
        };
        result.accept("Raj","Shewta");
    }
}
