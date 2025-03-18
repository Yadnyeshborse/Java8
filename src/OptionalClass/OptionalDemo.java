package OptionalClass;

import java.util.Objects;
import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {

        String email=null;
        //String email="As@gmail.com";

        //of ,empty, optional
        //Optional.empty() is a static method that returns an empty Optional instance, meaning it contains no value.
        //An Optional is a container object which may or may not contain a non-null value. When you call Optional.empty(), you're explicitly creating an Optional that is empty, i.e., there is no value inside it.
        Optional<Object> emptyOpional=Optional.empty();
        //System.out.println("Empty method="+emptyOpional);

        //of checks of email is empty of now
        //Optional<String> emailoptional=Optional.of(email);
       // System.out.println("Of"+emailoptional);

        //ofNullable
        Optional<String> stringNullable=Optional.ofNullable(email);
        System.out.println("24 output="+stringNullable);



        //if we want to have just value instead of Optional[As@gmail.com] we use get method
        //System.out.println(stringNullable.get);

        //ofNullable is safest way beacasue it handel null and not null value also

       // Optional.empty(): Always creates an empty Optional with no value.
        //Optional.of(T value): Creates an Optional with the given value, but throws a NullPointerException if the value is null.
        // Optional.ofNullable(T value): Safely handles both null and non-null values. It returns an empty Optional if the value is null, otherwise it returns an Optional containing the value.



        /////////////////////////////////////////////
        //isPresent use
//        if (stringNullable.isPresent()){
//            System.out.println(stringNullable);
//        }else {
//            System.out.println("Value not present");
//        }

        ////
        //orElse
        String name=null;
        Optional<String> opt=Optional.ofNullable(name);
        String defaultValue=opt.orElse("noreply@gmail.com");
        System.out.println("It will print default value if value is not present by using orElse "+defaultValue);

        //orElseGet
        String address=null;
        Optional<String> optionaOrElseGet=Optional.ofNullable(address);
        String value= optionaOrElseGet.orElseGet(()->"op@gmail.com");
        System.out.println("It will print default value bu orElseGet "+value);

        //orElseThrow
        String company=null;
        Optional<String> lp=Optional.ofNullable(company);
       // String optionalOrelseThrow= lp.orElseThrow(()->new IllegalArgumentException("Email not present"));
       // System.out.println("optionalOrelseThrow  = "+ optionalOrelseThrow);

        //ifPresent
        Optional<String> gender=Optional.of("Male");
        //gender.ifPresent((s -> System.out.println("Value is present")));

//        Optional<String> emptyp = Optional.empty();
//        emptyp.ifPresent(s -> System.out.println("Value not present"));

        //filter
        String abc="xyz";
        if (abc!=null && abc.contains("xyz")){
           // System.out.println("Present");
        }

        //by optional and lambda
        Optional<String> valuo=Optional.of("xyo");
        valuo.filter((res)->res.contains("xyo")).
                ifPresentOrElse((res)->System.out.println("It is present by lamda way"),
                        ()->System.out.println("It is not present"));

        //suppose if abc has spaces and we want to remove space and want to apply filter logic there
        String demo="LPI";
        Optional<String> l=Optional.of(demo);
        l.filter((m)->m.contains("LPI")).map(String::trim).ifPresent(s -> System.out.println("Present by trimming by map"));


    }
}
