package Default_Static_Method;

interface Human {
    String walk(String speed);   // Should return a String
    String Swim(String fast);    // Should return a String

    default void Climb(String height) {   // Default method
        System.out.println("Climb: " + height);
    }

    static String getCar() {  // Static method
        return "BMW";
    }
}

class Boss implements Human {
    @Override
    public String walk(String speed) {
        return speed;  // Returning the value of speed
    }

    @Override
    public String Swim(String fast) {  // Correct return type
        return fast;  // Returning the value of fast
    }
}

public class DefaultDemo {
    public static void main(String[] args) {
        Boss obj = new Boss();

        // Call and print the results of walk and Swim
        System.out.println("Swim: " + obj.Swim("KAS KAI"));
        System.out.println("Walk: " + obj.walk("BAR HAI KA"));

        // Call default method Climb
        obj.Climb("Ho chhan aahe");

        // Call static method and print its value
        String car = Human.getCar();
        System.out.println("Car: " + car);
    }
}
