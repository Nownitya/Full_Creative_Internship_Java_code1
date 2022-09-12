package JavaCodes.Interface;

interface Polygon4 {
    void getArea();

    default void getSides() {
        System.out.println("It have multiple sides.");
    }
}

class Rectangle3 implements Polygon4 {

    @Override
    public void getArea() {
        int length = 4;
        int breadth = 8;
        int area = length * breadth;
        System.out.println("Area of the rectangle: "+area);
    }

    @Override
    public void getSides() {
//        Polygon4.super.getSides();
        System.out.println("It have 4 sides");
    }
}

class Square2 implements Polygon4 {

    @Override
    public void getArea() {
        int length = 8;
        int area = length * length;
        System.out.println("Area of the square " + area);

    }

//    @Override
//    public void getSides() {
////        Polygon4.super.getSides();
//
//    }
}

public class MethodInInterfaceMain {
    public static void main(String[] args) {
        Rectangle3 r = new Rectangle3();
        r.getArea();
        r.getSides();

        Square2 s = new Square2();
        s.getArea();
        s.getSides();
    }
}
