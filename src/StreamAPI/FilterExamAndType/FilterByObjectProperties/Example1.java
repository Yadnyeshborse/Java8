package StreamAPI.FilterExamAndType.FilterByObjectProperties;

import java.util.stream.Stream;

public class Example1 {
    public static void filterByEven(){
        Stream<Integer> stream=Stream.of(23,76,1,2,8,5,3,2);
        stream.filter(x->(x%2==0)).forEach(System.out::println);
    }

    public static void filterByStartsWith(){
        Stream<String> stringStream=Stream.of("Ppo","KLJ","http://jijs","http://dfda");
        stringStream.filter(p->p.startsWith("http")).forEach(System.out::println);
    }
    public static void filterByStartsWithVowelsRegex(){
        String[] myArray="I am 24 years old and I want to be in Tier I company".split(" ");
        Stream<String> stream=Stream.of(myArray);
        stream.filter(x->x.matches("(a|e|i|o|u)\\w*")).forEach(System.out::println);

    }
    public static void main(String[] args) {
        filterByEven();
        System.out.println("Filter Even no");
        filterByStartsWith();
        System.out.println("Starts with");
        filterByStartsWithVowelsRegex();

    }
}
