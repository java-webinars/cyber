package edu.cyber.oop.domain;

public class Rectangle
{
    private double width;
    private double height;
    private double area;
    private double perimeter;

    public void setDimensions(double w, double h) {
        width = w;
        height = h;
        recalculate();
    }

    public double getArea() {
        return area;
    }

    public double getPerimeter() {
        return perimeter;
    }

    private void recalculate() {
        area = width * height;
        perimeter = 2 * (width + height);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                ", area=" + area +
                ", perimeter=" + perimeter +
                '}';
    }

    /**
     * Additional methods
     *
     * @param w
     */

    public void setWidth(double w) {
        width = w;
        recalculate();
    }

    public void setHeight(double h) {
        height = h;
        recalculate();
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public static String getClassName() {
        return "Class is calledRectangle";
    }
}
