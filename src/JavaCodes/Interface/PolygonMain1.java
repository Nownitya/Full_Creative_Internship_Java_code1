package JavaCodes.Interface;

import Java.P2_OOPs.O6_Java_Polymorphism.Polygon1;

interface Polygon2 {
    void getArea(int length,int breadth);
}

class Rectangle1 implements Polygon2 {
    @Override
    public void getArea(int length, int breadth) {
        System.out.println("The area of the rectangle is: " + (length * breadth));
    }
}

public class PolygonMain1 {
    public static void main(String[] args) {
        Rectangle1 p = new Rectangle1();
        p.getArea(7,9);
    }
}
