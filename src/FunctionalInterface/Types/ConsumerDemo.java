package FunctionalInterface.Types;


import java.util.function.Consumer;

//class ConsumerImp implements Consumer<String >{
//    @Override
//    public void accept(String  input) {
//        System.out.println(input);
//    }
//}
public class ConsumerDemo {
    public static void main(String[] args) {
//        Consumer<String> consumer=new ConsumerImp();
//        consumer.accept("Hello World");

        Consumer<String> consumer=(String input)->System.out.println(input);
        consumer.accept("By Lambda Expression");
    }
}
