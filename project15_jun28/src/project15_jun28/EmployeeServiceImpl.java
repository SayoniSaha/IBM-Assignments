package project15_jun28;

import java.util.*;

public class EmployeeServiceImpl implements EmployeeServiceInterface {
    private Vector<Employee> emp;

    public EmployeeServiceImpl() {
        emp = new Vector<>();
    }

    @Override
    public void createEmployee(int id, String firstname, String lastname, String email, double salary) {
        Employee e = new Employee(id, firstname, lastname, email, salary);
        emp.add(e);
        System.out.println("Created");
    }

    @Override
    public void displayAllEmployees() {
        if (emp.isEmpty()) {
            System.out.println("Invalid input");
        } else {
            System.out.println("\nEmployee Details:");
            for (Employee employee : emp) {
                System.out.println(employee.getDetails());
            }
        }
    }

    @Override
    public void deleteEmployeeById(int id) {
        boolean found = false;
        for (Employee e : emp) {
            if (e.getId() == id) {
                emp.remove(e);
                found = true;
                System.out.println("Deleted");
                break;
            }
        }
        if (!found) {
            System.out.println("Invalid input");
        }
    }

    @Override
    public void updateEmployeeById(int id, String firstname, String lastname, String email, double salary) {
        boolean found = false;
        for (Employee e : emp) {
            if (e.getId() == id) {
                e.setFirstname(firstname);
                e.setLastname(lastname);
                e.setEmail(email);
                e.setSalary(salary);
                found = true;
                System.out.println("Updated");
                break;
            }
        }
        if (!found) {
            System.out.println("Invalid input");
        }
    }
}

//public class EmployeeServiceImpl extends Employee{
//    private List<Employee> e;
//
//    public EmployeeServiceImpl() {
//        e = new ArrayList<>();
//    }
//
//    public void createEmployee(int id, String firstName, String lastName, String email, double salary) {
//        Employee employee = new Employee(id, firstName, lastName, email, salary);
//        e.add(employee);
//        System.out.println("Employee created");
//    }
//
//    public void displayAllEmployees() {
//        if (e.isEmpty()) {
//            System.out.println("Empty");
//        } else {
//            System.out.println("Employee Details: \n");
//            for (Employee emp : e) {
//                System.out.println(emp.getDetails());
//            }
//        }
//    }
//
//    public void deleteEmployeeById(int id) {
//        Iterator<Employee> iterator = e.iterator();
//        boolean removed = false;
//        while (iterator.hasNext()) {
//            Employee emp = iterator.next();
//            if (emp.getId() == id) {
//                iterator.remove();
//                removed = true;
//                System.out.println("Deleted");
//                break;
//            }
//        }
//        if (!removed) {
//            System.out.println("Invalid input");
//        }
//    }
//
//    public void updateEmployeeById(int id, String firstName, String lastName, String email, double salary) {
//        boolean updated = false;
//        for (Employee emp : e) {
//            if (emp.getId()==id) {
//                emp.setFirstname(firstName);
//                emp.setLastname(lastName);
//                emp.setEmail(email);
//                emp.setSalary(salary);
//                updated = true;
//                System.out.println("Updated");
//                break;
//            }
//        }
//        if (!updated) {
//            System.out.println("Invalid input");
//        }
//    }
//}

