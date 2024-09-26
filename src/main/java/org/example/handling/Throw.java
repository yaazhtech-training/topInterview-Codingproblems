package org.example.handling;

public class Throw {
    public static void main(String[] args) {
        try{
            int a= 10/2;
            throw new ArithmeticException("Hello world");
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
        System.out.println("program ended");
    }
}
