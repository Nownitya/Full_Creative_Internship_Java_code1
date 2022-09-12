package Java.P2_OOPs.O2_Java_Method_Overloading;

public class Animal1 {
    public void displayInfo() {
        System.out.println("I am an animal.");
    }
}

class Dog1 extends Animal1 {
    @Override
    public void displayInfo() {
        System.out.println("I am a dog.");
    }
}

class Main {
    public static void main(String[] args) {
        Dog1 d1 = new Dog1();
        d1.displayInfo();
    }
}