package org.example.exception;
import java.io.IOException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Serilization implements java.io.Serializable {
    public static void main(String[] args){
        ArrayList<String>emp =  new ArrayList<String>();
        emp.add("mythili");
        emp.add("CS");
        emp.add("Kmalapuram");
        try {
            FileOutputStream fileOut = new FileOutputStream("String.ser");
            ObjectOutputStream OutStream = new ObjectOutputStream(fileOut);
            OutStream.writeObject(emp);
            OutStream.close();
            fileOut.close();
            System.out.println("Object serilization saved to file");
        }
        catch (IOException e){
            e.printStackTrace();


        }




    }

}
