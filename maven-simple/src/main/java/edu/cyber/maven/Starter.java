package edu.cyber.maven;

public class Starter
{
    public static void main(String[] args) {
        SimpleApplication sa = new SimpleApplication();
        for (int i = 0; i < 50; i++) {
            System.out.println(sa.sum(i, i * 10));
        }
    }
}
