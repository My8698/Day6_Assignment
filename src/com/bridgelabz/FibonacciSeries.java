package com.bridgelabz;

public class FibonacciSeries {
    public static void main(String[] args) {

        int a = 0, b = 1;
        System.out.print(a + "" + b);
        int c;
        for (int i = 1; i <= 10; i++) {
            c = a + b;
            System.out.println("Fibonacci series is:" + c);
            a = b;
            b = c;


        }
    }
}