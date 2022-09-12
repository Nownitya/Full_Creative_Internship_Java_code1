package JavaCodeExamples.ObjectAndClass;

class Test3 {

}

class Test3_1 {
    @Override
    public String toString() {
        return "object";
    }
}

public class Main5 {
    public static void main(String[] args) {

        //  create an object of the Test class
        Test3 obj1 = new Test3();

        //  print the object
        System.out.println(obj1);

        Test3_1 obj2 = new Test3_1();
        System.out.println(obj2);
    }

}
