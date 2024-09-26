package org.example.reversearray;

public class ReverseArray {
    public static void main(String[] args) {
        String orginalStr = " Lion";
        String reverseStr = " ";
        {
            System.out.println("original String:" + orginalStr);
        }

        for (int i = 0; i < orginalStr.length(); i++)
        {
            reverseStr = orginalStr.charAt(i) + reverseStr;

        }
        {
            System.out.println("reversed String:" + reverseStr);
        }
    }
}











