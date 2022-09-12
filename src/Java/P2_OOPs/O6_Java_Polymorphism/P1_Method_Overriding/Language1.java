package Java.P2_OOPs.O6_Java_Polymorphism.P1_Method_Overriding;

class Language1 {
    public void displayInfo() {
        System.out.println("English is common Language");
    }
}

class Java1 extends Language1 {

    @Override
    public void displayInfo() {
        System.out.println("Java is a programming language");
    }
}

class Main1 {
    public static void main(String[] args) {

        //  Create  an object of java class
        Java1 j1 = new Java1();
        j1.displayInfo();

        //  create an object of language class
        Language1 l1 = new Language1();
        l1.displayInfo();
    }
}
