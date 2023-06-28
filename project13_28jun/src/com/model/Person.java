package com.model;

import java.util.Scanner;

class Person {
	private int id;
    private String name;

    public Person(int id, String name) {
    	this.id = id;
        this.name = name;
    }
    
    public int getId() {
    	return id;
    }

    public String getName() {
        return name;
    }
    
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int pId = sc.nextInt();
    	String pName = sc.nextLine();
        Politician politician = new Politician(pId,pName);
        politician.displayPolitician();

    	int sId = sc.nextInt();
    	String sName = sc.nextLine();
    	String sport = sc.nextLine();
    	Sportsman sportsman = new Sportsman(sId,sName,sport);
        sportsman.displaySportsPerson();
        
        sc.close();
    }
}

class Politician extends Person {
    public Politician(int id, String name) {
        super(id, name);
    }
    
    public int calculatePSalary() {
        return 1000;
    }

    public void displayPolitician() {
        System.out.println("Politician Details:");
        System.out.println("ID: " + getId());
        System.out.println("Name: " + getName());
        System.out.println("Salary: " + calculatePSalary());
    }
}

class Sportsman extends Person {
    private String sport;

    public Sportsman(int id, String name, String sport) {
        super(id, name);
        this.sport = sport;
    }
    
    public int calculateSSalary() {
        return 2000;
    }

    public void displaySportsPerson() {
        System.out.println("Sportsman Details:");
        System.out.println("ID: " + getId());
        System.out.println("Name: " + getName());
        System.out.println("Sport: " + sport);
        System.out.println("Salary: " + calculateSSalary());
    }
}
