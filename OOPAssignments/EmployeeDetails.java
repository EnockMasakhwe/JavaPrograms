package OOPAssignments;

import java.time.LocalDate;
import java.util.Scanner;

public class EmployeeDetails {

    String name;
    int salary;
    String hireDate;

    Scanner scanner = new Scanner(System.in);
    LocalDate currentDate = LocalDate.now();

    public void inputDetails() {
        System.out.print("\nEnter employee name: ");
        name = scanner.nextLine();
        System.out.print("Enter employee salary: ");
        salary = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter employee hire date (YYYY-MM-DD): ");
        hireDate = scanner.nextLine();
    }

    public void yearsOfService() {
        LocalDate hireLocalDate = LocalDate.parse(hireDate);
        int yearsOfService = currentDate.getYear() - hireLocalDate.getYear();

        System.out.println("\n==== Employee Details ====");
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: " + salary);   
        System.out.println("Employee Hire Date: " + hireDate);        
        System.out.println("Years of Service: \n" + yearsOfService);
    }

    public static void main(String[] args) {
        EmployeeDetails employee = new EmployeeDetails();
        employee.inputDetails();
        employee.yearsOfService();
    }
}