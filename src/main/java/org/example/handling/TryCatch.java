package org.example.handling;
import java.util.Scanner;
public class TryCatch {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        try {
            int a = 10 /0 ;
        }
        catch(Exception e){
            System.out.println("Exception handled");

        }
        System.out.println("Program ended");

    }

}
