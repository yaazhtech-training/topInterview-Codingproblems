package org.example.withoutthirdvariable;

public class Swapping {
    public static void main(String[] args) {
        int a = 30;
        int b = 60;
        {
            System.out.println("a is" + a + " " + "and b is" + b);
        }
        a = a + b;
        b = a - b;
        a = a - b;
        {
            System.out.println("After swapping, a is" + a + " " + "and b is" + b);
        }
    }
}