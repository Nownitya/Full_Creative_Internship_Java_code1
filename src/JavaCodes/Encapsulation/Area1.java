package JavaCodes.Encapsulation;

import java.util.Scanner;

public class Area1 {
    //  fields to create area
    int length;
    int breadth;

    //  constructor to initialize value
    Area1(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;

    }

    //  method to calculate area
    public void gerArea() {
        int area = length * breadth;
        System.out.println("Area: " + area);
    }
}

class Main {
    public static void main(String[] args) {
        //  create object of Area
        //  pass value of length and breadth
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Length: ");
        int length = sc.nextInt();
        System.out.print("Enter Breadth: ");
        int breadth = sc.nextInt();
        Area1 rectangle = new Area1(length, breadth);
        System.out.println("Area of rectangle");
        rectangle.gerArea();

        System.out.println("");
        System.out.print("Area: ");
        int area = sc.nextInt();
        Area1 square = new Area1(area, area);
        System.out.println("Area of square");
        square.gerArea();
    }

}
