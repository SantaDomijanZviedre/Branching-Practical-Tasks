package com.company;

public class practicalTask7 {

    public static void main(String[] args) {
        toMilesPerHour(100);
    }

    public static long toMilesPerHour(double kilometersPerHour) {

        if (kilometersPerHour < 0) {
            System.out.println("-1");
        } else if (kilometersPerHour > 0) {
            System.out.println(Math.round(kilometersPerHour * 0.6214));
        }
    }
}