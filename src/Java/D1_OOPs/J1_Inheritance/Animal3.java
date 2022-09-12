package Java.D1_OOPs.J1_Inheritance;
//  Hierarchical Inheritance
public class Animal3 {
    void eat() {
        System.out.println("Eating...");
    }
}

class Dog3 extends Animal3 {
    void bark() {
        System.out.println("Barking...");
    }
}

class Cat1 extends Animal3 {
    void meow() {
        System.out.println("Meowing...");
    }
}

class TestInheritance3 {
    public static void main(String[] args) {
        Cat1 c = new Cat1();
        c.meow();
        c.eat();

        Dog3 d = new Dog3();
        d.eat();
        d.bark();
    }

}
