package Java.D1_OOPs.J1_Inheritance;

//  Multilevel Inheritance
public class Animal2 {
    void eat() {
        System.out.println("Eating food...");
    }

}

class Dog2 extends Animal2 {

    void bark() {
        System.out.println("Barking...");
    }
}

class BabyDog1 extends Dog2 {
    void weep() {
        System.out.println("Weeping...");
    }
}

class TestInheritance2 {
    public static void main(String[] args) {
        BabyDog1 bd = new BabyDog1();

        bd.weep();
        bd.bark();
        bd.eat();
    }

}
