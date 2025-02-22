package methods;

interface Maina{
    void draw();
    default void act(){
        System.out.println("Acting");
    }
}
class Second implements Maina{


    @Override
    public void draw() {
        System.out.println("Inside Second class");
    }

    @Override
    public void act() {
        System.out.println("Killing");
    }
}
public class DefaultMethod {
    public static void main(String[] args) {

        Maina maina=()->System.out.println("Taking");
        maina.act();



        Second second=new Second();
        second.act();


    }
}
