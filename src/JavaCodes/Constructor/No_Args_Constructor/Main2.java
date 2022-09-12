package JavaCodes.Constructor.No_Args_Constructor;

import Kotlin.K1_Generics.Company;

class Company1 {
    String name;

    //  Public constructor
    public Company1() {
        name ="Full Creative";
    }
}

public class Main2 {
    public static void main(String[] args) {
        Company1 obj = new Company1();
        System.out.println("Company name = " + obj.name);
    }
}
