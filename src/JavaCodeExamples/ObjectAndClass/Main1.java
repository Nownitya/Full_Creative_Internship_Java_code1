package JavaCodeExamples.ObjectAndClass;

//  Add two complex Numbers

class Complex1 {

    double real;
    double imaginary;

    public Complex1(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;

    }
}

public class Main1 {
    public static void main(String[] args) {
        Complex1 c1 = new Complex1(2.3, 4.5),
                c2 = new Complex1(3.4, 5.0),
                temp;
        temp = add(c1, c2);
        System.out.printf("Sum = %.1f + %.1fi", temp.real, temp.imaginary);
    }

    public static Complex1 add(Complex1 c1, Complex1 c2) {

        Complex1 temp = new Complex1(0.0, 0.0);

        temp.real = c1.real + c2.real;
        temp.imaginary = c1.imaginary + c2.imaginary;

        return (temp);
    }

}


