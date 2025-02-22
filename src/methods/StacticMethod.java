package methods;

interface ActionStatic{
    void draw();
    static int sum(int a,int b){
        int c=a+b;
        return c;
    }
}
public class StacticMethod {
    public static void main(String[] args) {

        ActionStatic aStatic=() -> System.out.println("Runs");
        aStatic.draw();
        int result=ActionStatic.sum(2,8);
        System.out.println(result);

    }
}
