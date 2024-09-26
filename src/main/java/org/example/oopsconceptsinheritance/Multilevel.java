package org.example.oopsconceptsinheritance;


class Animal {
    void eat() {
        System.out.println("This animal is eating");

    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("Dog bark");
    }
}

class Puppys extends Dog{
    void weep(){
        System.out.println("Puppys weep");
    }
}
public class Multilevel {
    public static void main(String[] args){
        Puppys P1 = new Puppys();
        P1.bark();
        P1.eat();
    }

}


