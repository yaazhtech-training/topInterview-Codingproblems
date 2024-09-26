package org.example.polymorphism;
class animal{
    void eat(){
        System.out.println("This animal is eating");
    }

    void eat(int a){
        System.out.println("Dog is bowwww");
    }
}

public class OverLoadding {
    public static void main (String[] args){
        animal a =new animal();
        a.eat(5);
    }
}

