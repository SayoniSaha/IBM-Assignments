package project20_3jul;

import java.io.*;
import java.util.*;

public class App {

	public static void main(String args[]) throws IOException {
			Scanner sc = new Scanner(System.in);
			
	        EmployeeService employeeService = new EmployeeServiceImpl();	        
	        System.out.println("1. Create Employee");
	        System.out.println("2. Get Data");
	        System.out.print("Enter your choice: ");
	        int choice = sc.nextInt();
	        sc.nextLine(); 
	        
	        switch (choice) {
	            case 1: Employee employee = new Employee();
				        System.out.print("Enter Employee Name: ");
						String name = sc.nextLine();
						System.out.print("Enter Employee Salary: ");
						double salary=sc.nextDouble();
				        employee.setName(name);
				        employee.setSalary(salary);
			
				        employeeService.createEmployee(employee);
				        sc.close();
				        break;
		                
	            case 2: try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("database.data"))) {
	                    while (true) {
	                        Employee retrievedEmployee = (Employee) inputStream.readObject();
	                        System.out.println("Employee details retrieved from database.data:");
	                        System.out.println(retrievedEmployee);
	                    }
		                } catch (EOFException e) {
		                } catch (IOException | ClassNotFoundException e) {
		                    System.err.println(e);
		                }
		                break;
                
	            default:
	                System.out.println("Invalid choice");
	                break;
	        }
	        
	        sc.close();
	    }
}
