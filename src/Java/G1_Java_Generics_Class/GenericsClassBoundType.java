package Java.G1_Java_Generics_Class;

public class GenericsClassBoundType<T extends Number> {
    public void display() {
        System.out.println("This is a Bounded type generics class");
    }
}

class Main3 {
    public static void main(String[] args) {

        //  create an object of GenericsClass
        GenericsClassBoundType<Number> obj = new GenericsClassBoundType<>();
        obj.display();
    }
}
