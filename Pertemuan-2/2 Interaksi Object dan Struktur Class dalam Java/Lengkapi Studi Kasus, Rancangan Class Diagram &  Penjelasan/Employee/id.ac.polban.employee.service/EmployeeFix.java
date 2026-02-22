package id.ac.polban.employee.service;

import java.util.HashMap;
import java.util.Map;
import id.ac.polban.employee.model.*;
 
public class EmployeeServiceFix {
    private Map<Integer, EmployeeFix> employees = new HashMap<>();

    public void addEmployee(EmployeeFix emp) {
        employees.put(emp.getId(), emp);
    }

    public EmployeeFix getEmployee(int id) {
        return employees.get(id);
    }

    public void raiseSalary(int id, double percent) {
        EmployeeFix emp = employees.get(id);
        if (emp != null) {
            emp.setSalary(emp.getSalary() * (1 + percent / 100));
        }
    }

    public static boolean isValidSalary(double salary) {
        return salary > 0;
    }
}
