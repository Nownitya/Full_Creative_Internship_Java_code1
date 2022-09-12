package Java.G1_Java_Generics_Class;

//  Create a Generics Method
class Main2 {
    public static void main(String[] args) {





        //  initialize the class with Integer data
        GenericMethod method = new GenericMethod();

        //  generic method working with String
//        method.<String>genercMethod("Java Programming");
        //  generic method working with integer
        method.<Integer>genercMethod(25);


    }
}
class GenericMethod {

    //  Create a generic method
    public <T> void genercMethod(T data) {

        System.out.println("Generics Method");
        System.out.println("Data Passed: " + data);


    }
}
