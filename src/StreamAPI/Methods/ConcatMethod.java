package StreamAPI.Methods;

import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class ConcatMethod {
    public static void main(String[] args) {
        Stream<String> s1= Stream.of("Geeks", "for");
        Stream<String> s2=Stream.of("GeeksQuiz", "GeeksforGeeks");
        Stream.concat(s1,s2).forEach(System.out::println);
        System.out.println("Concatnate 4 stream");
        Stream<String> s7= Stream.of("Geeks", "for");
        Stream<String> s8=Stream.of("GeeksQuiz");
        Stream<String> s3= Stream.of( "for");
        Stream<String> s4=Stream.of("Geekseks");
        Stream.concat(Stream.concat(Stream.concat(s7,s8),s3),s4).forEach(System.out::println);
        System.out.println("Concanate 4 integer");
        DoubleStream stream1=DoubleStream.of(123,899);
        DoubleStream stream2=DoubleStream.of(57,344);
        DoubleStream.concat(stream1,stream2).forEach(System.out::println);

    }
}
