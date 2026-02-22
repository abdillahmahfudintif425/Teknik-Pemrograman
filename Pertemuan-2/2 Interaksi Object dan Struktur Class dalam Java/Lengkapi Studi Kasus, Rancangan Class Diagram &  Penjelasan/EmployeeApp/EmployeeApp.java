package employeeapp;

import id.ac.polban.employee.model.*;
import id.ac.polban.employee.service.*;

public class EmployeeApp {
    public static void main(String[] args) {
        Department dept = new Department("IT");
        EmploymentType type = new EmploymentType("Full-time");
        
        EmployeeFix emp = new EmployeeFix(1, "Citra", dept, type, 7000000);
        
        EmployeeServiceFix service = new EmployeeServiceFix();
        service.addEmployee(emp);
        
        System.out.println("Total Employee: " + EmployeeFix.getEmployeeCount());
        System.out.println("Gaji valid: " + EmployeeServiceFix.isValidSalary(emp.getSalary()));
    }
}
