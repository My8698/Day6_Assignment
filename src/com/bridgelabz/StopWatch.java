package com.bridgelabz;
import java.util.Scanner;
public class StopWatch {
    public static void main(String[] args) {
            System.out.println("Enter any character to start the stopwatch");
            Scanner sc =new Scanner(System.in);
            char start=sc.next().charAt(0);
            long starttimer =System.currentTimeMillis();
            System.out.println("Enter any character to stop the stop watch");
            Scanner sc1=new Scanner(System.in);
            char stop=sc1.next().charAt(0);
            long stoptimer =System.currentTimeMillis();
            double elapsedTime=stoptimer-starttimer;
            System.out.println("Time elapsed is: "+ elapsedTime/1000 + "  seconds");
        }

    }

