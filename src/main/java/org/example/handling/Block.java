package org.example.handling;

public class Block {
    public static void main(String[] args){
        int a=10,b=5;
        int c=0;
        try{
            int arr[] = null;
           // System.out.println(arr[1]);
            c=a/b;
            System.out.println("try block");
        }
        catch(ArithmeticException e){
            System.out.println("arithmetic exception has occurred");

        }
        catch(NullPointerException e){
            System.out.println("NullPointerException has occurred");
        }
        catch(Exception e){
            System.out.println("Exception has occurred");
        }
        finally {
            System.out.println("finally block");

        }
    }
}
