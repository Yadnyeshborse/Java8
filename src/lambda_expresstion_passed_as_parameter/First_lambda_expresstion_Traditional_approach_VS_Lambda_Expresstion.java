package lambda_expresstion_passed_as_parameter;

interface Shape{
    void draw();
}

class Square implements Shape{

    @Override
    public void draw() {
        System.out.println("Square class DraW Method");

    }
}

//2 nd example
class Reactangle implements Shape{

    @Override
    public void draw() {
        System.out.println("Rectangle Class Method");
    }
}

//3 rd eample
class Triangle implements Shape{
    @Override
    public void draw() {

    }
}





///abobe appproach is by traditinal way where we create interface and implemet it .It creates big code
public class First_lambda_expresstion_Traditional_approach_VS_Lambda_Expresstion {
    public static void main(String[] args) {


        //Shape square = () ->  System.out.println("Square class DraW Method");
        //square.draw();     //see it has reduce the big boiler code syntax

        //Shape reactangle=() -> System.out.println("Reactangle Class Draw Method");
        //reactangle.draw();

        //Shape traingle =()->System.out.println("Traingle Class Draw Method");
        //traingle.draw();

       // print(square);
       // print(reactangle);
       // print(traingle);

        //passing lambda expresstiion as parameter in method
        print(()->System.out.println("Square class DraW Method"));
        print(()->System.out.println("Reactangle Class Draw Method"));
        print(()->System.out.println("Traingle Class Draw Method"));
    }

    //here we are passing paramter
    public static void print(Shape shape) {
        shape.draw();

    }

}
