package Java.P2_OOPs.O6_Java_Polymorphism.P2_Method_Overloading;

//  Polymorphism using method overloading
class Pattern1 {

    //  Method without parameters
    public void display() {
        for (int i = 0; i < 10; i++) {
            System.out.print("*");
        }
    }

    //  Mention with single parameter
    public void display(char symbol) {
        for (int i = 0; i < 10; i++) {
            System.out.print(symbol);
        }
    }
}

class Main {
    public static void main(String[] args) {
        Pattern1 p1 = new Pattern1();

        //  Call method without any argument
        p1.display();

        System.out.println("\n");

        //  Call method with a dingle argument
        p1.display('#');
    }
}
