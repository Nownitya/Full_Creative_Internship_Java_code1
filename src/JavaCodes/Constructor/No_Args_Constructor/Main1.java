package JavaCodes.Constructor.No_Args_Constructor;

import Java.M1_Access_Modifiers.A3_PublicModifier.Main;

public class Main1 {
    int i;

    //  Constructor with no parameter
    private Main1() {
        i = 5;
        System.out.println("Constructor is called");

    }

    public static void main(String[] args) {
        //  calling the constructor without any parameter
        Main1 obj = new Main1();
        System.out.println("Value of i: " + obj.i);

    }


}
