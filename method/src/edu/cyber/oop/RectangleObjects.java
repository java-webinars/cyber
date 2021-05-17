package edu.cyber.oop;

import edu.cyber.oop.domain.Rectangle;

public class RectangleObjects
{
    public static void main(String[] args) {
        Rectangle.getClassName();

        Rectangle r1 = new Rectangle();
        r1.setDimensions(10.0, 5.0);
        System.out.println(r1);
        double area = r1.getArea();
        System.out.println(area);

        System.out.println();

        Rectangle r2 = new Rectangle();
        r2.setDimensions(2.0, 25.0);
        System.out.println(r2.getArea());
        r2.setHeight(8.0);
        System.out.println(r2.getArea());
    }
}
