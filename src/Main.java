import model.Employee;
import service.EmployeeService;
import service.impl.EmployeeServiceLegacy;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        EmployeeService employeeServiceLegacy = new EmployeeServiceLegacy();

        List<Employee> employees = employeeServiceLegacy.defaultEmployees();
        System.out.println("\n \n****************countEmployeesPerDepartment********************************");
        System.out.println(employeeServiceLegacy.countEmployeesPerDepartment(employees));
        System.out.println("\n \n****************groupEmployeesPerDepartment********************************");
        System.out.println(employeeServiceLegacy.groupEmployeesPerDepartment(employees));
        System.out.println("\n \n****************averageSalaryPerDepartment********************************");
        System.out.println(employeeServiceLegacy.averageSalaryPerDepartment(employees));
        System.out.println("\n \n****************getReportAskedYesterdayBySateholder************************");
        System.out.println(employeeServiceLegacy.getReportAskedYesterdayBySateholder(employees));
    }
}
