package FunctionalInterface;

interface Shape{
    void draw();
}

//class Traditional implements Shape{
//    @Override
//    public void draw() {
//        System.out.println("Traditional Way");
//    }
//}       //trational way
public class Lmanda_Example_for_functiona_interface {
    public static void main(String[] args) {
        Shape result =() -> System.out.println("By lamda Expressstion");
        result.draw();
    }

}
