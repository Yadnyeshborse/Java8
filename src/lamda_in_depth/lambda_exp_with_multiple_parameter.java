package lamda_in_depth;

@FunctionalInterface
interface Functional{
    int operation(int a,int b);
}
public class lambda_exp_with_multiple_parameter {
    public static void main(String[] args) {

        Functional add=(a,b)->a+b;
        Functional mul=(a,b)->a*b;
        System.out.println(add.operation(4,4));
        System.out.println(mul.operation(4,8));
    }
}
