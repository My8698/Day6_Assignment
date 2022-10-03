package com.bridgelabz;
import java.util.Scanner;

class RevereseFor {

        public static void main(String[] args) {
            Scanner scn=new Scanner(System.in);
            System.out.print("Enter number:");
            int num = scn.nextInt();
            int reverse = 0, rem;

            for (; num != 0; num = num / 10) {
                rem = num % 10;
                reverse = reverse * 10 + rem;

            }

            System.out.println("Reverese Number:" + reverse);
        }
    }




