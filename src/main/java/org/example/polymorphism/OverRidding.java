package org.example.polymorphism;
class Animal {
    void eat() {
        System.out.println("This animal is eating");
    }
}
class Dog extends Animal{
    void eat(){
        System.out.println("Dog is bowww");
    }
}

public class OverRidding {
    public static void main(String[] args){
        Dog d=new Dog();
        d.eat();
    }
}


