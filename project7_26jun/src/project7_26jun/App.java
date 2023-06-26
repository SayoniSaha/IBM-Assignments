package project7_26jun;

public class App {
	public static void main(String[] args) {
	
		Employee emp=new Employee();
		emp.createEmployee("123", "Abc def", -9000, new Department());
		System.out.println(emp.getDetails());	
	}
}