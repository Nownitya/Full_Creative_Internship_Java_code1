package JavaCodeExamples.ObjectAndClass;

import Java.Test;

class Test1 {
    //  First Class
}

class Test2 {
    //  Second Class
}

public class Main3 {
    public static void main(String[] args) {
        //  EX1
        System.out.println("EX1");
        //  Check the class of an object using getClass()
        //  Create object
        Test1 obj1 = new Test1();
        Test2 obj2 = new Test2();

        //  get the class of the object obj1
        System.out.println("The class of obj1 is: ");
        System.out.println(obj1.getClass());

        //  get the class of the object obj2
        System.out.println("The class of obj2 is: ");
        System.out.println(obj2.getClass());

        //  EX2
        //  Check the class of an object using instanceOf operator
        System.out.println("EX2");
        Test1 obj11 = new Test1();

        //  check if obj is an object of Test
        if (obj11 instanceof Test1) {
            System.out.println("obj is an object of the Test class");
        } else {
            System.out.println("obj is not an object of the Test class");
        }

        //  EX3
        //  Check the class of an object using isInstance()
        System.out.println("EX3");

        //  Create an object
        Test1 obj111 = new Test1();

        //  check if obj is an object of Test1
        if (Test1.class.isInstance(obj111)) {
            System.out.println("obj is an object of the Test class");
        } else {
            System.out.println("obj id not an object of the Test class");

        }

    }
}
