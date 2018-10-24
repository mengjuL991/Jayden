package com.company;

import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        // write your code here

        /*
        int numLemonade;
        int numSnacks;
        double cost;
        double pay;
        double change;

        Scanner scan = new Scanner(System.in);

        System.out.println("How many lemonade do you want:");
        numLemonade = scan.nextInt();
        System.out.println("How many snacks do you want:");
        numSnacks = scan.nextInt();

        cost = numLemonade * 1.25 + numSnacks * 1.5;

        System.out.println("The cost is: " + cost);

        System.out.println("How much money do you pay with:");
        pay = scan.nextDouble();
        change = pay - cost;

        System.out.println("Your change is " + change);
        */

        // write your code here
        /*
        int x = 10;
        int luckyNumber = (487 % 4) + 1;
        System.out.println("The lucky number is" + luckyNumber);
        if (x % 2 == 0 || x % 5 == 0) {
            System.out.println("I'm divisible by 2");
        } else if (x % 3 == 0) {
            System.out.println("I'm divisible by 3!");
        } else if (x % 5 == 0) {
            System.out.println("I'm divisible by 5!");
        } else {
            System.out.println("I'm not divisible by 5 or 2");
        }
        */

        /*
        Write a program that converts Fahrenheit to
        Celcius.  The formula is C = (5/9)*(F-32).  The
        user should input a temperature in Fahrenheit
        and it gets converted to Celsius
        */

        //        Scanner scan = new Scanner(System.in);
        //
        //        System.out.println("What fahrenheit is it? ");
        //        int fahrenheit = scan.nextInt();
        //        double celsius = ((double) 5/9) * (fahrenheit - 32);
        //        System.out.println(celsius);
        //


        /*Ask the user to enter the number 7.  If they
        enter in any other number have them try
        again.*/

        /*int targetNum = 7;
        int numEnter;

        Scanner scan = new Scanner(System.in);

        do {
            System.out.println("Please enter number 7 ");
            numEnter = scan.nextInt();
        } while (targetNum != numEnter);*/

        /*Ask the user to create a password.  Have them
        re-enter the password a second time for
        confirmation.  If the confirmation password
        does not match the initial password have them
        retry until they get it.  Note remember how to
        check equality of strings*/
        /*
        String createdPassword;

        Scanner scan = new Scanner(System.in);

        System.out.println("please enter your passwords ");
        createdPassword = scan.next();
        //        System.out.println(createdPassword);
        System.out.println("please enter your comfirm passwords");
        String confirmedPasswords = scan.next();

        while (!createdPassword.equals(confirmedPasswords)) {
            System.out.println("please enter your comfirm passwords");
            confirmedPasswords = scan.next();
        }*/


        /*
        Double randomNum = Math.random();
        double x = ((Math.random() * 6) + 1);

        Random rand = new Random();
        int randomInteger = rand.nextInt(7);
        for (int i = 0; i < 100; i++) {
            System.out.println(randomInteger = rand.nextInt(7));
        }


        int[] cars = new int[125];

        System.out.println(cars.length);
        for (int i = 0; i < cars.length; i++) {
            cars[i] = 1;
            System.out.println(cars[i]);
        }


        /*
        Create an array that holds 20 positions, give each
        index a random value between 1-6, then use a for
        loop to count how many 1's were randomly
        generated in  the array
         */

        /*
        int[] jayden = new int[20];
        Random danny = new Random();

        for (int i=0; i<20; i++) {
            jayden[i] = danny.nextInt(5) + 1;
            System.out.println(jayden[i]);
        }*/

        /*
        int x = (int)(Math.random()*100);//return 0-99
        System.out.println(x);
        */

        /*
        Random Jayden = new Random();
        int num = Jayden.nextInt(100);
        System.out.print(num);
        */


        int[]nums = new int [10];

        nums[0] = 20;
        nums[9] = 90;

        for (int k=0; k<10;k++) {
            nums[k] = k * 2;
        }

        System.out.println("Index\tValue");

        for (int k=0;k<10;k++) {
            System.out.println("" + k + "\t" + nums[k]);
        }

        System.out.println("\"Hi there\", MacBeth said");









    }


}
