package com.github;

public class Practise {

    public static void main(String[] args)
    {
        System.out.println("Welcome to Github Actions practise");
        Practise practise = new Practise();
        int sumOfTwoNumbers = practise.sumOfTwoNumbers(10, 10);
        System.out.println("sumOfTwoNumbers......"+sumOfTwoNumbers);
    }

    public int sumOfTwoNumbers(int number1, int number2)
    {
        return number1 + number2;
    }

    public int sumOfThreeNumbers(int number1, int number2, int number3)
    {
        System.out.println("sumOfThreeNumbers..............");
        return number1 + number2 + number3;
    }

}
