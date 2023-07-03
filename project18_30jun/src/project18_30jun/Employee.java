package project18_30jun;

import java.io.*;
import java.util.*;

public class Employee {

    private String id;
    private String name;
    private int age;
    private double salary;

    public Employee(String id, String name, int age, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }


    public String getId() {
		return id;
	}



	public void setId(String id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public double getSalary() {
		return salary;
	}



	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
    public String toString() {
        return "Employee[" + "Id:" + id + "\nName:" + name + "\nAge:" + age + "\nSalary:" + salary + ']';
    }

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("100", "ab", 25, 1000.0));
        employees.add(new Employee("101", "cd", 28, 2000.0));

        createEmployee(employees);

        List<Employee> empDetails = readDetails();
        System.out.println("Loaded employees:");
        for (Employee employee : empDetails) {
            System.out.println(employee);
        }

        Employee employeeToUpdate = empDetails.get(0);
        employeeToUpdate.setSalary(55000.0);
        updateEmployee(employeeToUpdate, empDetails.indexOf(employeeToUpdate));

        Employee employeeToDelete = empDetails.get(1);
        deleteEmployee(employeeToDelete);
    }

    private static void createEmployee(List<Employee> employees) {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("employee.data"))) {
            outputStream.writeObject(employees);
            System.out.println("Employee created");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static List<Employee> readDetails() {
        List<Employee> employees = new ArrayList<>();
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("employee.data"))) {
            employees = (List<Employee>) inputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return employees;
    }

    private static void updateEmployee(Employee employee, int index) {
        List<Employee> empDetails = readDetails();
        if (index >= 0 && index < empDetails.size()) {
            empDetails.set(index, employee);
            createEmployee(empDetails);
            System.out.println("Employee updated");
        } else {
            System.out.println("Invalid input");
        }
    }

    private static void deleteEmployee(Employee employee) {
        List<Employee> empDetails = readDetails();
        if (empDetails.remove(employee)) {
            createEmployee(empDetails);
            System.out.println("Employee deleted");
        } else {
            System.out.println("Invalid input");
        }
    }
}
