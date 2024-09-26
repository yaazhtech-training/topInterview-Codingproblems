package org.example.oopsconceptsinheritance;

class Animals{
    void eat(){
        System.out.println("This animal is eat");
    }
}
class Dogs extends Animal{
    void  bark()
    {
        System.out.println("Dog bark");
    }

}
class Cat extends Animal{
    void  meow(){
        System.out.println("Cat meow");
    }
}

public class Hierarical {
    public static void main(String[] args) {
        Cat C1 = new Cat();
        C1.meow();

    }
}



