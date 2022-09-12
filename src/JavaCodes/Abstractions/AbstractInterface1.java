package JavaCodes.Abstractions;

interface A1 {
    void a1();
    void b1();
    void c1();
    void d1();
}

abstract class B1 implements A1 {
    public void c1() {
        System.out.println("Called C");
    }
}

class C1 extends B1 {

    public void a1() {
        System.out.println("Calling a");
    }

    public void b1() {
        System.out.println("Calling b");
    }


//    public void c1() {
//        System.out.println("Calling c");
//    }

    public void d1() {
        System.out.println("Called d");
    }
}

abstract class D1 {
    abstract void e1();
}

interface E1 {
    void f1();
}

class F1 extends D1 implements A1,E1 {

    @Override
    public void a1() {

    }

    @Override
    public void b1() {

    }

    @Override
    public void c1() {

    }

    @Override
    public void d1() {

    }
    @Override
    void e1() {

    }

    @Override
    public void f1() {

    }


}



public class AbstractInterface1 {
    public static void main(String[] args) {
        A1 a = new C1();
        a.a1();
        a.b1();
        a.c1();
        a.d1();
//        System.out.println("");
        C1 c = new C1();
        c.a1();
        c.b1();
        c.c1();
        c.d1();
    }

}
