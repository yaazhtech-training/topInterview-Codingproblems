package org.example.oopsconceptsinheritance;
class Dad{
    int money = 2000;
}
class son extends Dad{

}

public class SingleLevel {
    public static void main (String[] args){
        son s1=new son();
        System.out.println(s1.money);
    }
}

