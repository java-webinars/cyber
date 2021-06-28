package edu.cyber.color;

import java.util.Arrays;

public class Main
{
    public static void main(String[] args) {
//        Table t = new Table();
//        System.out.println(Table.MATERIAL);
//        System.out.println(NewTable.MATERIAL);
//        String model = Table.getModelName();
//        System.out.println(model);

        Color color = new Color();
        System.out.println(color.toString() ) ; // prints "white"

        Color color2 = new Color(255, 0, 0);
        System.out.println(color2.toString() ) ; // prints "red"

        Color color3 = new Color(255, 44, 88);
        System.out.println(color3.toString() ) ; // prints "n/a"

        Color color4 = new Color(192, 192, 192);
        System.out.println(color4 ) ; // prints "light gray"
    }


}
