package org.example.objectclass;
class Students{
    String name;
    Integer age;
    Students(String n,Integer a){
        this.name=n;
        this.age=a;

    }
}

public class HashCode {
    public static void main(String[] args) {
        Students s=new Students("John",25);
        System.out.println(s);
        System.out.println(s.hashCode());
    }
}
