package project9_26jun;

import java.util.*;

public class App {

	public static void main(String[] args) {

		Vector<Employee> v = new Vector<Employee>();
		Scanner sc = new Scanner(System.in);
		EmployeeFactory factory = new EmployeeFactory();
		Employee e;

		int choice = 0;
		do {
			System.out.println("1. Create Employee");
			System.out.println("2. Display Employee Details");
			System.out.println("3. Display Details of particular Employee");
			System.out.println("4. Delete Details of particular Employee");
			System.out.println("0. Exit");
			System.out.print("Enter your choice:");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				e = factory.createEmployee();
				v.add(e);
				break;
			case 2:
				Enumeration<Employee> e1 = v.elements();
				while (e1.hasMoreElements()) {
					System.out.println(e1.nextElement());
				}
				break;
			case 3:
				System.out.print("Enter employee ID: ");
			    String id = sc.nextLine();
			    boolean found = false;
			    Enumeration<Employee> e2 = v.elements();
			    while (e2.hasMoreElements()) {
			        Employee employee = (Employee) e2.nextElement();
			        if (employee.getEmployeeId().equals(id)) {
			            System.out.println(employee);
			            found = true;
			            break;
			        }
			    }
			    if (!found) {
			        System.out.println("Invalid Id");
			    }
			    break;
			case 4:
			    System.out.print("Enter employee name: ");
			    String nameToDelete = sc.next();
			    boolean deleted = false;
			    Enumeration<Employee> e3 = v.elements();
			    while (e3.hasMoreElements()) {
			        Employee employee = e3.nextElement();
			        if (employee.getEmployeeName().equalsIgnoreCase(nameToDelete)) {
			            v.remove(employee);
			            deleted = true;
			            break;
			        }
			    }
			    if (deleted) {
			        System.out.println("Deleted");
			    } else {
			        System.out.println("Invalid Name");
			    }
			    break;
			case 0:
				System.out.println("Exit");
				System.exit(1);
				break;
			default:
				System.out.println("Invalid. Try again.");
				break;
			}

		} while (choice != 0);
		sc.close();

	}

}