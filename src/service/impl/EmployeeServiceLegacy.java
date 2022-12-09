package service.impl;

import dao.DepartmentReport;
import model.Employee;
import service.EmployeeService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeeServiceLegacy implements EmployeeService {

    /*
    * This is the legacy service written by the architectGOD
    * Of course only one method works, the rest can be done by a mortal jr.
    * You must use good old for structures to return the results, don't use stream api or lambdas
    * May the force be with you
    */

    @Override
    public Map<String, Integer> countEmployeesPerDepartment(List<Employee> employees) {
        Map<String, Integer> result = new HashMap<>();
        for (Employee emp:employees) {
            if (result.containsKey(emp.getDepartment())) {
                result.put(emp.getDepartment().name(), result.get(emp.getDepartment().name()) + 1);
            } else {
                result.put(emp.getDepartment().name(), 1);
            }
        }
        return result;
    }

    @Override
    public Map<String, List<Employee>> groupEmployeesPerDepartment(List<Employee> employees) {
        // TODO: The architectGOD was busy. You must implement the logic
        return null;
    }

    @Override
    public Map<String, Double> averageSalaryPerDepartment(List<Employee> employees) {
        // TODO: The architectGOD was busy. You must implement the logic
        return null;
    }

    @Override
    public List<DepartmentReport> getReportAskedYesterdayBySateholder(List<Employee> employees) {
        // TODO: The architectGOD was busy. You must implment the logic
        return null;
    }
}
