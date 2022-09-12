package Java.P1_OOPs.O3_Java_Method_Overloading;

class MethodOverloading1 {
    private static void display(int a) {
        System.out.println("Argument: " + a);
    }

    private static void display(int a, int b) {
        System.out.println("Arguments: " + a + " and " + b);
    }

    public static void main(String[] args) {
        display(1);
        display(1,5);
    }

}
