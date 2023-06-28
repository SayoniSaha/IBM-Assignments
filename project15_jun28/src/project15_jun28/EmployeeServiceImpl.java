package project15_jun28;

import java.util.*;

public class EmployeeServiceImpl extends Employee{
    private List<Employee> e;

    public EmployeeServiceImpl() {
        e = new ArrayList<>();
    }

    public void createEmployee(int id, String firstName, String lastName, String email, double salary) {
        Employee employee = new Employee(id, firstName, lastName, email, salary);
        e.add(employee);
        System.out.println("Employee created");
    }

    public void displayAllEmployees() {
        if (e.isEmpty()) {
            System.out.println("Empty");
        } else {
            System.out.println("Employee Details: \n");
            for (Employee emp : e) {
                System.out.println(emp.getDetails());
            }
        }
    }

    public void deleteEmployeeById(int id) {
        Iterator<Employee> iterator = e.iterator();
        boolean removed = false;
        while (iterator.hasNext()) {
            Employee emp = iterator.next();
            if (emp.getId() == id) {
                iterator.remove();
                removed = true;
                System.out.println("Deleted");
                break;
            }
        }
        if (!removed) {
            System.out.println("Invalid input");
        }
    }

    public void updateEmployeeById(int id, String firstName, String lastName, String email, double salary) {
        boolean updated = false;
        for (Employee emp : e) {
            if (emp.getId()==id) {
                emp.setFirstname(firstName);
                emp.setLastname(lastName);
                emp.setEmail(email);
                emp.setSalary(salary);
                updated = true;
                System.out.println("Updated");
                break;
            }
        }
        if (!updated) {
            System.out.println("Invalid input");
        }
    }
}