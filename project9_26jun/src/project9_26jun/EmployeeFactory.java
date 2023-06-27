package project9_26jun;
import java.util.*;

public class EmployeeFactory {
	
	private Scanner sc = new Scanner(System.in);
	public Employee createEmployee()
	{
		Employee e=new Employee();
		System.out.print("Enter Name:");
		String eName=sc.next();
		System.out.print("Enter Salary:");
		int eSalary=sc.nextInt();
		
		
		System.out.print("Enter Department:");
		String dName=sc.next();
		Department d=createDepartment(dName);
		e.setDepartment(d);
		e.setEmployeeId(UUID.randomUUID().toString());
		e.setEmployeeName(eName);
		e.setEmployeeSalary(eSalary);
		return e;
	}
	
	private Department createDepartment(String deptName)
	{
		Department d = new Department();
		
		System.out.print("Enter City:");
		String city=sc.next();
		System.out.print("Enter Country:");
		String country=sc.next();
		System.out.print("Enter Pincode:");
		int pin=sc.nextInt();
		Location l=createLocation(city, pin, country);
		d.setDepartmentId(UUID.randomUUID().toString());
		d.setDepartmentName(deptName);
		d.setLocation(l);
		return d;
	}
	
	private Location createLocation(String city,int pin,String country)
	{
		Location l = new Location();
		l.setLocationId(UUID.randomUUID().toString());
		l.setCity(city);
		l.setCountryName(country);
		l.setPinCode(pin);
		return l;
	}
}