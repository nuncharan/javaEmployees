package service;

import dao.DepartmentReport;
import model.Department;
import model.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public interface EmployeeService {

    Map<String, Integer> countEmployeesPerDepartment(List<Employee> employees);
    Map<String, List<Employee>> groupEmployeesPerDepartment(List<Employee> employees);
    Map<String, Double> averageSalaryPerDepartment(List<Employee> employees);
    List<DepartmentReport> getReportAskedYesterdayBySateholder(List<Employee> employees);

        default List<Employee> defaultEmployees() {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee(1, "Hugo", Department.SER_VICIOS, 10000));
        list.add(new Employee(2, "Paco", Department.DESARROLLO, 11000));
        list.add(new Employee(3, "Luis", Department.SOTORPE, 12500));
        list.add(new Employee(4, "Juan", Department.SOTORPE, 11500));
            list.add(new Employee(5, "Jesus", Department.DESARROLLO, 18000));
        list.add(new Employee(6, "Carlos", Department.DESARROLLO, 15000));
        return list;
    }
}
