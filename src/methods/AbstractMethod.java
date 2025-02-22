package methods;

interface Action {
    void draw();
}
class Reactangle implements Action {

    @Override
    public void draw() {
        System.out.println("Run");
    }
}
public class AbstractMethod {
    public static void main(String[] args) {
        Reactangle reactangle=new Reactangle();
        reactangle.draw();

        Action take=()->System.out.println("Running");
        take.draw();


    }
}
