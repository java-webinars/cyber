package edu.cyber.calc;

public class CalcRunner
{
    public static void main(String[] args) {
        Calc a = new Calc();
        a.setX(10);
        a.setY(5);
        a.minus();
        System.out.println(a.getResult());

        a.plus();
        System.out.println(a.getResult());


        CalcNew b = new CalcNew();
        b.setX(100);
        b.setY(70);
        System.out.println(b.getSubstruction());
        System.out.println(b.getAddition());
    }
}
