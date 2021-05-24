package edu.cyber.calc;

public class CalcNew
{
    private int x;
    private int y;

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getSubstruction() {
        return x - y;
    }

    public int getAddition() {
        return x + y;
    }
}
