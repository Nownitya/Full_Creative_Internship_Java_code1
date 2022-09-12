package Java.P2_OOPs.O6_Java_Polymorphism;

//  Polymorphic Variables
class ProgrammingLanguage1 {
    public void display() {
        System.out.println("Java is a Programming Language");
    }
}

class Java1 extends ProgrammingLanguage1 {
    @Override
    public void display() {
        System.out.println("I am a Object Oriented Language");

    }
}

class Main {
    public static void main(String[] args) {

        //  Declare an object variable
        ProgrammingLanguage1 p1;

        //Create an object of ProgrammingLanguage
        p1 = new ProgrammingLanguage1();
        p1.display();

        //  Create object of jave class
        p1 = new Java1();
        p1.display();
    }
}
