package edu.cyber.calc;

/**
 * This assignment is another calculator class, but it will be encapsulated.
 * <p>
 * Attributes
 * <p>
 * int: x, y, result
 * Attributes should be encapsulated
 * <p>
 * Instance Methods:
 * <p>
 * getResult() - getter method for private result
 * setY(int y) - setter method for private y
 * setX(int x) - setter method for private x
 * void plus() - adds x and y (x+y) values and assigns to result
 * void minus() - subtracts x and y(x-y) values and assigns to result
 * Example:
 * <p>
 * Calc a = new Calc();
 * a.setX(10);
 * a.setY(5);
 * a.minus();
 * <p>
 * System.out.println(a.getResult());
 * prints: 5
 * <p>
 * a.plus();
 * System.out.println(a.getResult());
 * prints: 15
 */
public class Calc
{
    private int x;
    private int y;
    private int result;

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void plus() {
        result = x + y;
    }

    public void minus() {
        result = x - y;
    }

    public int getResult() {
        return result;
    }
}
