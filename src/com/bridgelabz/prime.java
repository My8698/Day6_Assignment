package com.bridgelabz;

import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.print("Enter a number:");
        int n= scn.nextInt();

        if (isPrime(n))
        {
            System.out.println(n+ " is prime number");
        }
        else
        {
            System.out.println(n+ " is not prime number");
        }
    }
    public static boolean isPrime(int n){
        if (n<=1){
            return false;

        }
        for (int i=2;i<Math.sqrt(n);i++){
            if (n%i==0){
                return false;
            }
        }
        return true;
    }
}
