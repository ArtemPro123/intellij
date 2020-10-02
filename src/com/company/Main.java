package com.company;

import org.w3c.dom.ls.LSInput;

import java.awt.*;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //primitive types
        int age1 = 30;
        long viewCount = 3_123_123_123L;
        float price = 10.90F;
        char letter = 'A';
        boolean isEligible = false;
        age1 = 35;

        //Ref Type (needs memory allocation/Instances)
        byte age2 = 30;
        Date now = new Date();
        now.getTime();

        Point point1 = new Point(1, 1);
        Point point2 = point1;

        String message = "Hello \"World\"" + " !!";
        //System.out.println(message.replace("!","*"));

        int[] numbers = new int[5];
        numbers[0] = 1;
        numbers[1] = 2;
        //System.out.println(Arrays.toString(numbers));

        //Casting (Implicit/automatically)
         double x = 1.1;
         double y = x + 2;
         //Mathematical operators
         double result1 = Math.round(Math.random() * 100);

         //Formatting Numbers
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String result = currency.format(1234567.891);

        //Reading input from the User
        //Scanner scanner = new Scanner(System.in);
        //System.out.print("Age: ");
        //byte age = scanner.nextByte();

        //Logical Operators
        int temperature = 22;
        boolean hasHighIncome = true;
        boolean hasGoodCredit = true;
        boolean hasCriminalRecord = false;
        boolean isEligible2 =  (hasHighIncome || hasGoodCredit) && !hasCriminalRecord;

        //If Statements
        int income = 120_000;
        boolean HighSalary;
        if (income > 100_000){
            HighSalary = true;
        } else {
            HighSalary = false;
        }

        //for loops
        for (int i = 0; i < 2; i++) {
            System.out.println("Hello World " + i);
        }

        //While loops
//        Scanner scanner = new Scanner(System.in);
//        String input = "";
//        while (!input.equals("quit")){
//            System.out.println("Input: ");
//            input = scanner.next().toLowerCase();
//            System.out.println(input);
//        }

    //if using while true make sure to have a break statement
    }
}
