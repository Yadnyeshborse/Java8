package lamda_in_depth.parameter;

interface Test1{
    void print1();
}

public class No_parameter {
    static void fun(Test1 t){
        t.print1();
    }
    public static void main(String[] args) {

        fun(()->System.out.println("Print"));

        //short cut dotally different way
//        Runnable r=()->System.out.println("Print By Runnable");
//        r.run();
    }
}
