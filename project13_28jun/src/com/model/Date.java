package com.model;
import java.util.*;

public class Date {
	private int d;
	private int m;
	private int y;
    private static int minM = 1;
    private static int maxM = 12;
    private static int minD = 1;
    private static int[] maxD = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

    public Date(int d, int m, int y) {
        this.d = d;
        this.m = m;
        this.y = y;
    }

    public boolean validMonth() {
        return m >= minM && m <= maxM;
    }

    public boolean validDay() {
        if (m >= minM && m <= maxM) {
            int maxDays = maxD[m - 1];
            if (m == 2 && leapYear()) {
                maxDays = 29;
            }
            return d >= minD && d <= maxDays;
        }
        return false;
    }

    private boolean leapYear() {
        return (y % 4 == 0 && y % 100 != 0) || (y % 400 == 0);
    }

    public Date getNextday() {
        int nextD = d + 1;
        int nextM = m;
        int nextY = y;

        int maxDays = maxD[m - 1];
        if (m == 2 && leapYear()) {
            maxDays = 29;
        }

        if (nextD > maxDays) {
            nextD = 1;
            nextM++;
            if (nextM > maxM) {
                nextM = 1;
                nextY++;
            }
        }

        return new Date(nextD, nextM, nextY);
    }

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int d = sc.nextInt();
    	int m = sc.nextInt();
    	int y = sc.nextInt();
        Date date = new Date(d, m, y);
        if (date.validMonth()) {
            System.out.println("Valid month");
        } else {
            System.out.println("Month invalid");
        }

        if (date.validDay()) {
            System.out.println("Valid day");
        } else {
            System.out.println("Day invalid");
        }

        Date nextD = date.getNextday();
        System.out.printf("Next day: \n %02d/%02d/%04d%n", nextD.d, nextD.m, nextD.y);
        sc.close();
    }
}
