package com.calapi;

public class Calculator {
    public int solution;
    int a, b;
    int operation;

    //constructor for initialising the values and calling calc function
    public Calculator(int n1, int n2, int operator) {
        a = n1;
        b= n2;
        operation = operator;
        Calc();
    }

    //method to add two numbers
    private int addition(int a, int b) {
        return a + b;
    }

    //method to subtract two numbers
    private int subtraction(int a, int b) {
        return a - b;
    }

    //method to multiply two numbers
    private int multiplication(int a, int b) {
        return a * b;
    }

    //method to divide two numbers
    private int division(int a, int b) {
        return a / b;
    }

    //method to calculate the number on the given choices
    private int Calc() {
        switch (operation) {
            case (1):
                solution = addition(a, b);
                break;
            case (2):
                solution = subtraction(a, b);
                break;
            case (3):
                solution = multiplication(a, b);
                break;
            case (4):
                solution = division(a, b);
                break;
        }
        return solution;

    }
}
