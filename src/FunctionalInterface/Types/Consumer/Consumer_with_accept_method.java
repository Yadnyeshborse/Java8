package FunctionalInterface.Types.Consumer;


import java.util.function.Consumer;

class ConsumerImp implements Consumer<String>{

    @Override
    public void accept(String s) {
        System.out.println(s);

    }
}
public class Consumer_with_accept_method {
    public static void main(String[] args) {
//        Consumer<String> res=new ConsumerImp();
//        res.accept("Rahul");

        Consumer<String>  consumer=(String input)->System.out.println(input);
        consumer.accept("Manish");
    }
}
