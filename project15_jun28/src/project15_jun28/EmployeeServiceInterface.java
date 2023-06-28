package project15_jun28;

public interface EmployeeServiceInterface {
    void createEmployee(int id, String firstname, String lastname, String email, double salary);

    void displayAllEmployees();

    void deleteEmployeeById(int id);

    void updateEmployeeById(int id, String firstname, String lastname, String email, double salary);
}
