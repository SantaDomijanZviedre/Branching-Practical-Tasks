package com.company;

import java.util.Scanner;

public class practicalTask2_2 {

    public static void main(String[] args) {
        gradeLevel();
    }
    static void gradeLevel() {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your grade:");
        char grade = input.next().toUpperCase().charAt(0);

        switch (grade) {
            case 'A':
            case 'B':
                System.out.println("Perfect! You are so clever!"); break;
            case 'C':
                System.out.println("Good! But you can do better!"); break;
            case 'D':
            case 'E':
                System.out.println("It's not good! You should study!"); break;
            case 'F':
                System.out.println("Fail! You need to repeat the exam!"); break;
            default:
                System.out.println("Please add the default case in the code!");
        }
    }
}
