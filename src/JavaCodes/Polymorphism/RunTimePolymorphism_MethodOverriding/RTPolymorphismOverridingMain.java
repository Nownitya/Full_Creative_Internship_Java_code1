package JavaCodes.Polymorphism.RunTimePolymorphism_MethodOverriding;

class Language1 {
    public void displayInfo() {
        System.out.println("English is common Language");
    }
}

class Java1 extends Language1 {
    @Override
    public void displayInfo() {
//        super.displayInfo();
        System.out.println("Java is a Programming Language.");
    }
}

public class RTPolymorphismOverridingMain {
    public static void main(String[] args) {
        Java1 j1 = new Java1();
        j1.displayInfo();

        Language1 l1 = new Language1();
        l1.displayInfo();

    }
}
