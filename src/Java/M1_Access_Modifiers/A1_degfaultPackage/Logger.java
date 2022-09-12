package Java.M1_Access_Modifiers.A1_degfaultPackage;

public class Logger {
    void message() {
        System.out.println("This is Default Access Modifiers");

    }

    public static void main(String[] args) {
        Logger msg = new Logger();
        msg.message();
    }
}
