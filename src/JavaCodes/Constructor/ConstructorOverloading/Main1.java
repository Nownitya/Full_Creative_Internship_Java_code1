package JavaCodes.Constructor.ConstructorOverloading;

public class Main1 {
    String language;

    //  Constructor with no parameter
    Main1() {
        this.language = "Java";

    }

    //  Constructor with a single parameter
    Main1(String language) {
        this.language = language;
    }

    public void getName() {
        System.out.println("Programming Language: "+this.language);
    }

    public static void main(String[] args) {
        //  call constructor with no parameter
        Main1 obj1 = new Main1();

        //  call constructor with a single parameter
        Main1 obj2 = new Main1("Kotlin");

        //
        obj1.getName();
        obj2.getName();

    }
}
