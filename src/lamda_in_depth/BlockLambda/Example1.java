package lamda_in_depth.BlockLambda;

//In Java, a "block lambda" refers to a lambda expression where the body of the lambda
//contains multiple statements enclosed within curly braces {}. This is in contrast to a
//        single-expression lambda, which has a more concise syntax.

interface Func{
    int fact(int n);
}
public class Example1 {
    public static void main(String[] args) {

        Func result=(int num)->{
            int res=1;
            for (int i=1;i<=num;i++){
                res=res*i;

            }
            return res;
        };
        System.out.println(result.fact(5));
    }
}
