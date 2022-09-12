package JavaCodes.Interface;

interface Line1 {
    void getLengths(double length);
}

interface Polygon3 {
    void getBreadths(double breadth);
}

class Rectangle2 implements Line1, Polygon3 {

    @Override
    public void getLengths(double length) {
        System.out.println("Length: "+length);
    }

    @Override
    public void getBreadths(double breadth) {
        System.out.println("Breadth: "+breadth);
    }
}
public class MultiInterfaceMain1 {
    public static void main(String[] args) {
        Polygon3 p = new Rectangle2();
        p.getBreadths(5);
//        p.getLength(8);     //  error because getLength is not defined in Polygon3
        Rectangle2 r = new Rectangle2();
        r.getLengths(5);
        r.getBreadths(8);
    }
}
