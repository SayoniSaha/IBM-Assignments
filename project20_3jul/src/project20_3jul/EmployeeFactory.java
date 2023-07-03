package project20_3jul;

import java.io.*;

public class EmployeeFactory {

	public void createEmployee(Employee employee) throws IOException {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("src\\database.data"))) {
            outputStream.writeObject(employee);
            System.out.println("Employee created");
        } catch(NotSerializableException e) {
        	System.out.println(e);
        }
    }

}
