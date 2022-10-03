package com.bridgelabz;

import java.util.Scanner;

public class PerfectNo {
    public static int factors(int num) {
        int sum = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum = sum + i;
            }

        }
        return sum;
    }

    public static void main(String[] args) {
        int s, number;
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter number:");
        number = scn.nextInt();

        s = factors(number);
        if (s == number) {
            System.out.println(number + " is perfect number");
        } else {
            System.out.println(number + " is not perfect number");
        }
    }

}