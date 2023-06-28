package project15_jun28;

import java.util.*;

public class Tester {
    public static void main(String[] args) {
    	EmployeeServiceImpl e = new EmployeeServiceImpl();
    	Scanner sc = new Scanner(System.in);
        int choice = 0;
        do {
            System.out.println("1. Create Employee");
            System.out.println("2. Display Employees");
            System.out.println("3. Delete Employee by ID");
            System.out.println("4. Update Employee by ID");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter id: ");
                    int id = sc.nextInt();
                    System.out.print("Enter firstname: ");
                    String firstname = sc.next();
                    System.out.print("Enter lastname: ");
                    String lastname = sc.next();
                    System.out.print("Enter email: ");
                    String email = sc.next();
                    System.out.print("Enter salary: ");
                    double salary = sc.nextDouble();

                    e.createEmployee(id, firstname, lastname, email, salary);
                    break;
                case 2:
                	e.displayAllEmployees();
                    break;
                case 3:
                	System.out.print("Enter ID to delete: ");
                    int dId = sc.nextInt();
                    e.deleteEmployeeById(dId);
                    break;
                case 4:
                    System.out.print("Enter ID to update: ");
                    int updateId = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter firstname: ");
                    String updatedFirstname = sc.nextLine();
                    System.out.print("Enter lastname: ");
                    String updatedLastname = sc.nextLine();
                    System.out.print("Enter email: ");
                    String updatedemail = sc.nextLine();
                    System.out.print("Enter salary: ");
                    double updatedsalary = sc.nextDouble();
                    sc.nextLine();
                    e.updateEmployeeById(updateId, updatedFirstname, updatedLastname, updatedemail, updatedsalary);
                    break;
                case 0:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Invalid input");
                    break;
            }

            System.out.println();
        } while (choice != 0);

        sc.close();
    }
}     

