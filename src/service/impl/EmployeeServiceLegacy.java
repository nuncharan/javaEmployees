package service.impl;

import dao.DepartmentReport;
import model.Employee;
import service.EmployeeService;

import java.util.ArrayList;
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
            if (result.containsKey(emp.getDepartment().name())) {
                result.put(emp.getDepartment().name(), result.get(emp.getDepartment().name()) + 1);
            } else {
                result.put(emp.getDepartment().name(), 1);
            }
        }
        return result;
    }

    @Override
    public Map<String, List<Employee>> groupEmployeesPerDepartment(List<Employee> employees) {
        
        Map<String, List<Employee>> result = new HashMap<>();

        for(Employee emp: employees) {

            if (result.containsKey(emp.getDepartment().name())) {
                List<Employee> actualList = result.get(emp.getDepartment().name());
                actualList.add(emp);
                result.put(emp.getDepartment().name(), actualList);
            } else {
                List<Employee> listed = new ArrayList<>();
                listed.add(emp);
                result.put(emp.getDepartment().name(), listed);
            }
        }
        return result;
    }

    @Override
    public Map<String, Double> averageSalaryPerDepartment(List<Employee> employees) {
        // TODO: The architectGOD was busy. You must implement the logic
        Map<String, Double> result = new HashMap<>();


        Map<String, List<Employee>> departments = new HashMap<>();

        for(Employee emp: employees) {

            if (departments.containsKey(emp.getDepartment().name())) {
                List<Employee> actualList = departments.get(emp.getDepartment().name());
                actualList.add(emp);
                departments.put(emp.getDepartment().name(), actualList);
            } else {
                List<Employee> listed = new ArrayList<>();
                listed.add(emp);
                departments.put(emp.getDepartment().name(), listed);
            }
        }


        departments.forEach((key, value) -> {
            double average = 0.0;
            for (Employee emp: value) {
                average += emp.getSalary();
            }
            result.put(key, average/value.size());
        });

        return result;
    }

    @Override
    public List<DepartmentReport> getReportAskedYesterdayBySateholder(List<Employee> employees) {

        List<DepartmentReport> reports = new ArrayList<>();

        Map<String, List<Employee>> departments = new HashMap<>();

        for(Employee emp: employees) {
            if (departments.containsKey(emp.getDepartment().getCode())) {
                List<Employee> actualList = departments.get(emp.getDepartment().getCode());
                actualList.add(emp);
                departments.put(emp.getDepartment().getCode(), actualList);
            } else {
                List<Employee> listed = new ArrayList<>();
                listed.add(emp);
                departments.put(emp.getDepartment().getCode(), listed);
            }
        }

        departments.forEach((key, value) -> {

            DepartmentReport departmentReport = new DepartmentReport();
            departmentReport.setCode(key);
            departmentReport.setEmployeeCount(value.size());
            if (value.size() == 1) {
                departmentReport.setTopWageEmployee(value.get(0));
                departmentReport.setAverageSalary(value.get(0).getSalary());
            } else if(value.size() > 1) {
                departmentReport.setTopWageEmployee(value.get(0));
                double averageSalary = 0.0;
                    for(Employee emp:value) {
                        averageSalary += emp.getSalary();
                        if (emp.getSalary() > departmentReport.getTopWagEmployee().getSalary()) {
                            departmentReport.setTopWageEmployee(emp);
                        }
                    }
                    departmentReport.setAverageSalary(averageSalary / departmentReport.getEmployeeCount());
                }
            reports.add(departmentReport);
        });

        // TODO: The architectGOD was busy. You must implment the logic
        return reports;
    }
}
