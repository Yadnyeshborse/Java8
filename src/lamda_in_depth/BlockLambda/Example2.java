package lamda_in_depth.BlockLambda;

interface LeapYear{
    boolean isLeap(int year);
}
public class Example2 {
    public static void main(String[] args) {
        LeapYear leapYear=(int year)->{
            return ((year%400==0) || (year%4==0 & year%100!=0));
        };
        if (leapYear.isLeap(2021)){
            System.out.println("It is leap year");
        }else {
            System.out.println("It is not");
        }
    }
}
