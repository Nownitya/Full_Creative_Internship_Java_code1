package JavaCodes.Inheritance;

//  Hybrid inheritance using a combination of Multilevel and Hierarchical inheritance.
class GrandFather1 {
    public void printGrandFather() {
        System.out.println("Grandfather Class");
    }
}

class Father1 extends GrandFather1 {

    public void printFather() {
        System.out.println("Father Class inherited Grandfather Class");
    }
}

class Child1 extends Father1{
    public Child1() {
        System.out.println("Inside Child 1 Class");
    }
    public void printChild1() {
        System.out.println("Child 1 Class inherited Father Class");
    }
}

class Child2 extends Father1 {
    public Child2() {
        System.out.println("Inside Child 2 Class");
    }
    public void printChild2() {
        System.out.println("Child 2 Class inherited Father Class");
    }

}

class Main {
    public static void main(String[] args) {
        Child1 c1 = new Child1();
        c1.printChild1();   //  Accessing Child1 class method
        c1.printFather();   //  Accessing Father class method
        c1.printGrandFather();  //  Accessing Grandfather class method

        Child2 c2 = new Child2();
        c2.printChild2();   //  Accessing Child1 class method
        c2.printFather();   //  Accessing Father class method
        c2.printGrandFather();  //  Accessing Grandfather class method
    }
}
