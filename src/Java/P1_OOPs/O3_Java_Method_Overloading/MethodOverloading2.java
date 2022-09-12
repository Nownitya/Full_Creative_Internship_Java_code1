package Java.P1_OOPs.O3_Java_Method_Overloading;
//  Method Overloading by changing the data type of parameters
public class MethodOverloading2 {
    //  This method accept int
    public static void display(int a) {
        System.out.println("Got Integer data.");
    }

    //This method accepts string object
    public static void display(String a) {
        System.out.println("Got String Object.");
    }

    public static void main(String[] args) {
        display(1);
        display("Hello");
    }
}
