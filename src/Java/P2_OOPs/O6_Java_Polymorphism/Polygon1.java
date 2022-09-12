package Java.P2_OOPs.O6_Java_Polymorphism;
//  Java Polymorphism
public class Polygon1 {

    //  method to render a shape
    public void render() {
        System.out.println("Render Polygon...");
    }
}

class Square1 extends Polygon1 {

    //  render Square
    public void render() {
        System.out.println("Rendering Square...");
    }
}

class Circle1 extends Polygon1 {

    //  render circle
    public void render() {
        System.out.println("Rendering circle...");
    }
}

class Main1 {
    public static void main(String[] args) {
        // create an object of square
        Square1 s1 = new Square1();
        s1.render();

        //  create an object of circle
        Circle1 c1 = new Circle1();
        c1.render();
    }
}
