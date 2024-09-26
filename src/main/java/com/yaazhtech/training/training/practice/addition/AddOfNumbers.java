package com.yaazhtech.training.training.practice.addition;

public class AddOfNumbers {
    private int x = 5;
    private int y = 6;
    private int sum;

    // Constructor to initialize the sum
    public AddOfNumbers() {
        sum = x + y;
        System.out.println("Sum: " + sum);
    }

    public static void main(String[] args) {
        // Create an instance of AddOfNumbers to trigger the constructor
        new AddOfNumbers();
    }
}
