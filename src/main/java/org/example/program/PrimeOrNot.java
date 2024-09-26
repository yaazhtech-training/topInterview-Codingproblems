package org.example.program;

public class PrimeOrNot {
    public static void main(String[] args){
        int n=10;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                System.out.println("Prime");
                return;
            }

           else {
                System.out.println("Not Prime");
            }
        }
    }
}
