package JavaCodes.Constructor.Default_Constructor;

public class Main4 {
    int a;
    boolean b;

    Main4() {
        a = 0;
        b = false;
    }

    public static void main(String[] args) {
        //  call the constructor
        Main4 obj = new Main4();

        System.out.println("Default Value: ");
        System.out.println("a = " + obj.a);
        System.out.println("b = " + obj.b);
    }
}
