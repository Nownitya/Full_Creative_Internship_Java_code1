package JavaCodes.Polymorphism;


class ProgrammingLanguage {
    public void display() {
        System.out.println("This is Programming Language.");
    }
}

class Java extends ProgrammingLanguage {
    @Override
    public void display() {
        System.out.println("This is Object-Oriented Programming");
    }
}

public class PolymorphicVariable1 {
    public static void main(String[] args) {

        // declare an objects variable and creating Object
        ProgrammingLanguage pl1 = new ProgrammingLanguage();
        pl1.display();

        //  create object of java class
        pl1 = new Java();
        pl1.display();

    }
}
