import id.ac.polban.employee.model.*;
import id.ac.polban.employee.service.*;

public class Main {
    public static void main(String[] args) {
        Department dept = new Department("Engineering");
        EmploymentType type = new EmploymentType("Full-time");
        
        EmployeeFix emp1 = new EmployeeFix(1, "Andi", dept, type, 5000000);
        EmployeeFix emp2 = new EmployeeFix(2, "Budi", dept, type, 6000000);
        
        EmployeeServiceFix service = new EmployeeServiceFix();
        service.addEmployee(emp1);
        service.addEmployee(emp2);
        
        System.out.println("=== Employee System ===");
        System.out.println("Total Employee: " + EmployeeFix.getEmployeeCount());
        System.out.println("Salary Andi valid: " + EmployeeServiceFix.isValidSalary(emp1.getSalary()));
        
        service.raiseSalary(1, 10);
        System.out.println("Salary Andi setelah naik 10%: " + service.getEmployee(1).getSalary());
    }
}