package Questions.Lambda;

interface NumbericNo{
    boolean fact(int n,int d);
}
public class Factor {
    public static void main(String[] args) {

        NumbericNo res=(n,d)->(n%d)==0;
        if (res.fact(10, 2)) {
            System.out.println("2 is a factor of 10");
        }
        if (res.fact(10, 3)) {
            System.out.println("3 is a factor of 10");
        } else {
            System.out.println("3 is not a factor of 10");
        }


    }
}
