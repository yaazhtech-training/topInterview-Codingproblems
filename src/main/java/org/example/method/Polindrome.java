package org.example.method;


public class Polindrome {
    public static void main(String[] args) {
        int n = 123464321;
        int reverseN = n;
        {
            System.out.println("Reverse of n= " + reverseN);

        }
        if (n == reverseN) {
            System.out.println("Palindrome=yes");

        }
        else {
            System.out.println("Palindrome=no");
        }
    }
}

