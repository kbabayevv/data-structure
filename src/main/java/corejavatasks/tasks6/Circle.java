package corejavatasks.tasks6;

import static java.lang.Math.PI;

public class Circle {
    private double radius;


    public Circle() {
        this.radius = 1;
    }

    public Circle(double radius) {
        this.radius = radius;
        System.out.println("Radius is " + radius);
        System.out.println("Area is " + getArea());

    }

    public double getArea() {
        return PI * Math.pow(radius, 2);
    }

    public static void main(String[] args) {
        Circle c1 = new Circle(2.0);
        Circle c2 = new Circle(12);
        Circle c3 = new Circle(24);
    }
}
