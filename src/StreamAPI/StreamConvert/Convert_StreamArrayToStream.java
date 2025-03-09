package StreamAPI.StreamConvert;



import java.util.Arrays;
import java.util.stream.Stream;

public class Convert_StreamArrayToStream {
    public static void main(String[] args) {
        String arr[]={"Raj","Patil","OPPP"};
        Stream<String> streamp= Arrays.stream(arr);
        streamp.forEach(o->System.out.print(o+" "));
    }
}
