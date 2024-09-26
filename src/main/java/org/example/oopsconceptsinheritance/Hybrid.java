package org.example.oopsconceptsinheritance;
class animal {
    void eat() {
        System.out.println("This animal is eat");

    }

    class Dogs extends animal {
        void eat() {
            System.out.println("Dog eat");
        }
    }

    class Cats extends animal {
        void meow() {
            System.out.println("Cat meow");
        }
    }

    class Puppy extends Dog {
        void weep() {
            System.out.println("Puppy weep");
        }
    }

    public class Hybrid {
        public static void main(String[] args) {
            Dog d1 = new Dog();
            Cat c2 = new Cat();
            c2.meow();
            d1.eat();

        }
    }
}


