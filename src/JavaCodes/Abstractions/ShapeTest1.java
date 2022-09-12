package JavaCodes.Abstractions;

import javafx.scene.shape.Shape;

abstract class Shape1 {
    String color;

    abstract double area();

    public abstract String toString();

    public Shape1(String colors) {
        System.out.println("Shape of constructor called");
        this.color = colors;
    }
    public String getColor(){ return color; }
}

class Circle extends Shape1 {
    double radius;

    public Circle(String colors, double radius) {
        super(colors);
        System.out.println("Circle constructor called");
        this.radius = radius;

    }

    @Override
    double area() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public String toString() {
        return "Circle color is" + super.getColor() + "and area is : " + area();
    }
}

class Rectangle extends Shape1 {

    double length;
    double width;

    public Rectangle(String colors,Double length,Double width) {
        super(colors);
        System.out.println("Rectangle constructor called ");
        this.length = length;
        this.width = width;
    }
    @Override
    double area() {
        return length * width;
    }

    @Override
    public String toString() {
        return "Rectangle color is " + super.getColor()
                + "and area is : " + area();
    }
}

public class ShapeTest1 {
    public static void main(String[] args) {
        Shape1 s1 = new Circle("Red",5.0);
        Shape1 s2 = new Rectangle("Yellow", 4.0, 7.0);

        System.out.println(s1.toString());
        System.out.println(s2.toString());
    }
}
