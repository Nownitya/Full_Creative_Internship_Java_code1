package JavaCodes.Polymorphism;

class Polygon1 {
    public void render() {
        System.out.println("Rendering Polygon...");
    }
}

class Square1 extends Polygon1 {

    //  Rendering Square
    public void render() {
//        super.render();
        System.out.println("Rendering Square...");
    }
}

class Circle1 extends Polygon1{
    //  Rendering circle


    @Override
    public void render() {
//        super.render();
        System.out.println("Rendering Circle...");
    }
}

public class PolymorphismMain1 {
    public static void main(String[] args) {
        Square1 s1 = new Square1();
        s1.render();

        Circle1 c1 = new Circle1();
        c1.render();
    }

}
