package ru.job4j.oop;

public class Calculator {
    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public int multiply(int a) {
        return x * a;
    }

    public static int minus(int y) {
        return y - x;
    }

    public int divide(int y) {
        return y / x;
    }

    public int sumAllOperation(int z) {
        return sum(z) + multiply(z) + minus(z) + divide(z);
    }

    public static void main(String[] args) {
        int result = Calculator.sum(10);
        System.out.println(result);
        Calculator calculator = new Calculator();
        int resultMultiply = calculator.multiply(2);
        System.out.println(resultMultiply);
        int resultMinus = Calculator.minus(4);
        System.out.println(resultMinus);
        int resultDivide = calculator.divide(3);
        System.out.println(resultDivide);
        int resultSum = calculator.sumAllOperation(5);
        System.out.println(resultSum);
    }
}
