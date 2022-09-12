package Java.P2_OOPs.O4_Abstract_Class_And_Method;

//  Implementing Abstract Methods
abstract class Animal1 {
    abstract void makeSound();

    public void eat() {
        System.out.println("Eating...");
    }
}

class Dog1 extends Animal1 {

    //  Provide implementation of abstract method
    public void makeSound() {
        System.out.println("Bark Bark...");
    }
}

class Main2 {
    public static void main(String[] args) {

        //  Create an object of Dog class
        Dog1 d1 = new Dog1();

        d1.makeSound();
        d1.eat();
    }

}
