package JavaCodes.Constructor;

public class ConstructorMain1 {
    private String name;

    ConstructorMain1() {
        System.out.println("Constructor Called");
        name = "Constructor";

    }

    public static void main(String[] args) {
        //  Constructor is invoked while creating an object of the Main class
        ConstructorMain1 obj = new ConstructorMain1();
        System.out.println("The name is "+obj.name);
    }
}
