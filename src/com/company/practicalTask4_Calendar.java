package com.company;

import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;

public class practicalTask4_Calendar {

    // Practical Task 4 (not alternative) with Calendar

    public static void main(String[] args) {

        Scanner findMonth = new Scanner(System.in);
        System.out.println("Please enter the day number:");

        int dayNumber = findMonth.nextInt();
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.DAY_OF_YEAR, dayNumber);

        if(dayNumber < 1 || dayNumber > 365)
        {
            System.out.println("Day number must be 1 to 365. Please enter valid day number: ");
        } else {
            System.out.println("The day number is: " + dayNumber);
            System.out.println("It is: " + cal.getDisplayName(Calendar.MONTH, Calendar.LONG_FORMAT, Locale.ENGLISH));
        }
    }

}
