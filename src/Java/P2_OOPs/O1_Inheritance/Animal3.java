package Java.P2_OOPs.O1_Inheritance;
//  super Keyword in Inheritance
public class Animal3 {
    //  Method in superclass
    public void eat() {
        System.out.println("Eating...");
    }
}

//Dog inherits Animal
class Dog3 extends Animal3 {

    // Overriding the eat() method
    @Override
    public void eat() {
        super.eat();
        System.out.println("Eating food...");
    }

    public void bark() {
        System.out.println("Barking...");
    }
}

class Main3 {
    public static void main(String[] args) {
        //create an object of the subclass
        Dog2 labrador = new Dog2();

        // call the eat() method
        labrador.eat();
        labrador.bark();
    }

}
