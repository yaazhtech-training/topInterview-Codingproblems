package org.example.handling;

import java.io.File;
import java.io.FileInputStream;
class main{
    public static void findFile() throws Exception{
        File newFile = new File("Text.txt");
        FileInputStream stream = new FileInputStream(newFile);
    }
}
public class Throws {
    public static void main(String[] args) {
        try{
            main.findFile();
        }
        catch(Exception e){
            System.out.println("Program ended");
        }


    }
}

