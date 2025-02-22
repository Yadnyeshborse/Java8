package lamda_in_depth.parameter;

interface Test2{
    void print(String msg);
}

public class With_paramter {
    static void sample(Test2 test2,String msg){
        test2.print(msg);
    }
    public static void main(String[] args) {
        sample((msg)->System.out.println(msg),"Hello Parameter");
    }
}
