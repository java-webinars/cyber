package edu.cyber.credit;

import java.util.Scanner;

class Main
{
    public static void main(String[] args) {

        // Do not touch below
        Scanner input = new Scanner(System.in);

        Discover discover = new Discover(input.nextLong(), input.nextDouble());
        System.out.println(discover);

        CapitalOne capitalOne = new CapitalOne(input.nextLong(), input.nextDouble());
        capitalOne.useCard();
        System.out.println(capitalOne);

        Chase chase = new Chase(input.nextLong(), input.nextDouble());
        chase.payBalance(input.nextDouble());
        System.out.println(chase);


    }
}