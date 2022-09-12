package Java.D1_OOPs.J1_Inheritance;
//  Single Inheritance
public class Animal1 {
    void eat() {
        System.out.println("Eating Food...");
    }

}

class Dog1 extends Animal1 {
    void bark(){
        System.out.println("Barking...");

    }
}

class TestInheritance1{
    public static void main(String[] args) {
        Dog1 d = new Dog1();
        d.bark();
        d.eat();
    }
}
