package project6_26jun;

public class App {
	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.createEmployee("123","abc","10000",new Department());
		System.out.println(emp.getDetails());
	}
}
