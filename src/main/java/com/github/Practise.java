package com.github;

public class Practise {

    public static void main(String[] args)
    {
        System.out.println("Welcome to Github Actions practise");
        Practise practise = new Practise();
        int sumOfTwoNumbers = practise.sumOfTwoNumbers(10, 10);
    }

    public int sumOfTwoNumbers(int number1, int number2)
    {
        return number1 + number2;
    }

}
