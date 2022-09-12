package Java.P2_OOPs.O5_Java_Interfaces;

//  Java Interface
interface Polygon1 {
    void getArea(int length, int breadth);

}

//  Implements the Polygon interface
class Rectangle1 implements Polygon1 {

    public void getArea(int length, int breadth) {
        System.out.println("The area of the rectangle is" +(length*breadth));
    }
}

class Main1 {
    public static void main(String[] args) {
        Rectangle1 r1 = new Rectangle1();
        r1.getArea(4,6);
    }
}
