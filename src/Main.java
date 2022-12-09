import model.Employee;
import service.EmployeeService;
import service.impl.EmployeeServiceLegacy;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        EmployeeService employeeServiceLegacy = new EmployeeServiceLegacy();

        List<Employee> employees = employeeServiceLegacy.defaultEmployees();

        System.out.println(employeeServiceLegacy.countEmployeesPerDepartment(employees));
        System.out.println(employeeServiceLegacy.groupEmployeesPerDepartment(employees));
        System.out.println(employeeServiceLegacy.averageSalaryPerDepartment(employees));
        System.out.println(employeeServiceLegacy.getReportAskedYesterdayBySateholder(employees));
    }
}
