package com.model;

import java.util.*;

public class Clock {
	private int h;
	private int m;
	private int s;
	private boolean am;
    private static final int maxH = 24;
    private static final int maxM_S = 60;

    public Clock(int h, int m, int s) {
        setH(h);
        setM(m);
        setS(s);
    }

    public void setH(int h) {
        if (h >= 0 && h < maxH) {
            this.h = h;
        } else {
            System.out.println("Invalid hours");
        }
    }

    public void setM(int m) {
        if (m >=0 && m<maxM_S) {
            this.m=m;
        } else {
            System.out.println("Invalid minutes");
        }
    }

    public void setS(int s) {
        if (s>=0 && s < maxM_S) {
            this.s = s;
        } else {
            System.out.println("Invalid seconds");
        }
    }

    public boolean setTime(int h) {
        if(h>12) {
        	am = false;
        }
        else {
        	am = true;
        }
        return am;
    }

    public void display() {
        String mode = am ? "AM":"PM";
        System.out.printf("%02d:%02d:%02d %s%n", h, m, s, mode);
    }

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int h = sc.nextInt();
    	int m = sc.nextInt();
    	int s = sc.nextInt();
    	Clock clock = new Clock(h, m, s);
        clock.setTime(h);
        clock.display();
        sc.close();
    }
}
