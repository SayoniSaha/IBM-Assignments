package project21_3jul;

import java.io.*;

public class App {

	public static void main(String args[]) {
		EmployeeFactory ef = new EmployeeFactory();
		try {
			ef.createEmployee();
		} catch (NumberFormatException e) {
			System.err.println("Error!" + e.getMessage());
		} catch (SalaryCheckException e) {
			System.err.println(e.getErrorMessage());
		} catch (NameCheckException e) {
			System.err.println(e.getErrorMessage());
		} catch (IOException e) {
			System.err.println(e.getMessage());
		}
	}
}
