package org.example.exception;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class DeSerilization {
    public static void main(String[] args) {


        try{
            FileInputStream fileIn = new FileInputStream("String.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            InputStream.nullInputStream();
            in.close();
            fileIn.close();

        } catch (Exception e) {
            e.printStackTrace();
            return;



        }
        System.out.println("Deserilization employee..."+emp.size());
        System.out.println("Emp Name:"+emp.get(0));
        System.out.println("Emp dep:"+emp.get(1));
        System.out.println("Emp addr:"+emp.get(2));

    }

}
