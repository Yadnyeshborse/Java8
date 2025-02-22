package lamda_in_depth.parameter;


interface Fun{
    void run(int a,int b);
}
public class MultiplePArameter {
    static void operation(Fun fun,int a,int b){
        fun.run(a,b);
    }
    public static void main(String[] args) {
        operation((int a,int b)->System.out.println(a+b),10,20);

    }
}
