package lambda_parameter;


interface Addable{
    int addition(int a,int b);
}

class addtion implements Addable{
    @Override
    public int addition(int a, int b) {
        return (a+b);
    }
}
public class Lambda_para {
    public static void main(String[] args) {

//  First Way: Using a single-line lambda expression without specifying types for parameters
// First way: Single-line lambda expression (concise)
//        Addable sum=(a,b)-> (a+b);
//        int result=sum.addition(2,4);
//        System.out.println(result);

        //Second Way: Using a multi-line lambda
        // expression where types are explicitly defined, and we include additional logic.
        //Second way: Multi-line lambda expression with explicit parameter types
        Addable som=(int a,int b)->{
            int c=(a+b);
            return c;
        };
        int result2=som.addition(1,9);
        System.out.println("Second way of writing"+" "+ result2);
        System.out.println("End zal");
    }
}
