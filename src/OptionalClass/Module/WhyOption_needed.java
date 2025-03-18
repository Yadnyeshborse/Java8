package OptionalClass.Module;

import java.util.Optional;

public class WhyOption_needed {
    public static void main(String[] args) {
        String[] arr=new String[5];
        //String result=arr[2].toLowerCase();
        //System.out.println(result);
        //it throw null pointer exception to avoid this we used optional class
        Optional<String> op=Optional.ofNullable(arr[2]);
        if (op.isPresent()){
            System.out.println("Va;ue is present");
        }else {
            System.out.println("Not present");
        }
    }
}
