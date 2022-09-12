package Java.P2_OOPs.O4_Abstract_Class_And_Method;
//  Java Abstract Class and Method
abstract class Language1 {
    // Field and Method
    //  Method of abstract class
    public void display() {
        System.out.println("This is Java Programming...");
    }
}
class Main1 extends Language1 {
    public static void main(String[] args) {
        //  Create an object of Main
        Main1 obj = new Main1();

        //  access method of abstract class
        // using object of Main Class
        obj.display();
    }
}

