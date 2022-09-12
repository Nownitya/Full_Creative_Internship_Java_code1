package Java.P2_OOPs.O7_Java_Encapsulation;
//  Java Encapsulation
class Area1 {

    //  field to calculate area
    int length;
    int breadth;

    //  constructor to initialize values
    Area1(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;

    }

    //  method to calculate area
    public void getArea() {
        int area = length * breadth;
        System.out.println("Area = "+area);
    }
}

class Main {
    public static void main(String[] args) {

        // create object of Area
        // pass value of length and breadth
        Area1 rectangle1 = new Area1(5, 8);
        rectangle1.getArea();
    }
}
