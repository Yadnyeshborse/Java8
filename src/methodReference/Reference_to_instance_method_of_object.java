package methodReference;

@FunctionalInterface
interface Printable{
    void print(String msg);
}

public class Reference_to_instance_method_of_object {
    public void display(String msg){
        msg=msg.toUpperCase();
        System.out.println(msg);
    }

    public static void main(String[] args) {
        Reference_to_instance_method_of_object referenceToInstanceMethod=new Reference_to_instance_method_of_object();


        //lambda expression
        Printable printable=(msg)->referenceToInstanceMethod.display(msg);
        printable.print("hello wrold");

        //Reference to instance method of object
        Printable printableMethodREference= referenceToInstanceMethod::display;
        printableMethodREference.print("hello wrold");
    }
}
