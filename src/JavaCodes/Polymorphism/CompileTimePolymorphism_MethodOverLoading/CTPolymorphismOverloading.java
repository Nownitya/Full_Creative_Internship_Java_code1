package JavaCodes.Polymorphism.CompileTimePolymorphism_MethodOverLoading;

class Pattern1 {
    //  Method without parameter
    public void display() {
        for (int i = 0; i < 10; i++) {
            System.out.print("*");
        }
    }

    //  method with single parameter
    public void display(char symbol) {
        for (int i = 0; i < 10; i++) {
            System.out.print(symbol);
        }
    }

    public void display(char symbol1, char symbol2) {
        for (int i = 0; i < 10; i++) {
            System.out.print(symbol1);
            System.out.print(symbol2);
        }
    }
}

public class CTPolymorphismOverloading {
    public static void main(String[] args) {
        Pattern1 p1 = new Pattern1();
        p1.display();
        System.out.println("");
        p1.display('#');
        System.out.println("");
        p1.display('$','₹');
    }
}
