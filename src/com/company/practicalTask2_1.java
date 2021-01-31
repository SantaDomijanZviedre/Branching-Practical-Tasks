package com.company;

import java.util.Locale;
import java.util.Scanner;

public class practicalTask2_1 {

    public static void main(String[] args) {
        dayNumberInput();
        dayOfWeekInput();
    }
    static void dayNumberInput() {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the day number of the week: ");
        int dayNumber = input.nextInt();

            switch (dayNumber) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                    System.out.println("It is a working day!");
                    break;
                case 6:
                case 7:
                    System.out.println("It is a holiday!");
                    break;
                default:
                    System.out.println("Please add correct verification in the code!");
            }
    }

    // testing same task with string input:
    static void dayOfWeekInput() {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter Day of the week: ");
        String dayName = input.next().toUpperCase(Locale.ROOT);
        // not sure what Locale.ROOT does in this case,
        // that is what java offers automatically but it would work also without it

        switch (dayName) {
            case "MONDAY":
            case "MON":
            case "TUESDAY":
            case "TUE":
            case "WEDNESDAY":
            case "WED":
            case "THURSDAY":
            case "THU":
            case "FRIDAY":
            case "FRI":
                System.out.println("It is a working day!"); break;
            case "SATURDAY":
            case "SAT":
            case "SUNDAY":
            case "SUN":
                System.out.println("It is a holiday!"); break;
            default:
                System.out.println("Please add correct verification in the code!");
        }
    }
}
// Also I would like to learn how to tell program to
// bring user back to value entry if the initial entry is wrong.