package org.example.objectclass;
class Student{
    String name;
    Integer age;
    Student(String n,Integer a){
        this.name=n;
        this.age =a;
    }
}

public class ToString {
    public static void main(String[] args){
        Student s1 = new Student("John Doe", 23);
        System.out.println(s1);
        System.out.println(s1.toString());
    }
}
