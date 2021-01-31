package com.company;

import java.text.DecimalFormat;
import java.util.Scanner;

public class practicalTask2_3 {

    public static void main(String[] args) {
        calculationOptions();
    }

        static void calculationOptions() {

            Scanner input = new Scanner(System.in);
            DecimalFormat df = new DecimalFormat("###.##");
            System.out.println("Please enter First number: ");
            double num1 = input.nextDouble();
            System.out.println("Please enter Second number: ");
            double num2 = input.nextDouble();
            System.out.println("Please enter what would you like to do with numbers: " +
                    "+ (plus), - (minus), / (divide), * (multiply), % (remainder)," +
                    "p (print), b (bigger), s (smaller): ");
            char option = input.next().charAt(0);

            switch (option) {
                case '+':
                    System.out.println("Sum is: " + (num1+num2)); break;
                case '-':
                    System.out.println("Substraction is: " + (num1-num2)); break;
                case '/':
                    System.out.println("Division is: " + (df.format(num1/num2))); break;
                case '*':
                    System.out.println("Multiplication is: " + (num1*num2)); break;
                case '%':
                    System.out.println("Remainder is: " + (num1%num2)); break;
                case 'p':
                    System.out.println(num1 + " " + num2); break;
                case 'b':
                    System.out.println("Bigger is: " + (Math.max(num1,num2))); break;
                case 's':
                    System.out.println("Smaller is: " + (Math.min(num1,num2))); break;
                default:
                    System.out.println("Please enter valid option: ");
            }
    }
}
