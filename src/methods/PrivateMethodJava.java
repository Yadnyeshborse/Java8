package methods;

interface MainPri{
    void run();
    default void dMethod(String message){
        logformated("Info",message);
    }
    default void eMethod(String message){
        logformated("error",message);
    }
    private void logformated(String level,String message){
        System.out.println("["+level+"]"+message);
    }

    // Static method using a private static method
    static void logStaticInfo(String message) {
        logStaticFormatted("INFO", message);
    }

    // Private static method
    private static void logStaticFormatted(String level, String message) {
        System.out.println("[" + level + "] " + message);
    }
}
class ConsoleLoggeer implements MainPri{

    @Override
    public void run() {
        System.out.println("Run");
    }
}
public class PrivateMethodJava {
    public static void main(String[] args) {
        MainPri pri=new ConsoleLoggeer();
        pri.dMethod("This is Info message");
        pri.eMethod("This is error message");

        MainPri.logStaticInfo("This is static message");


    }
}
