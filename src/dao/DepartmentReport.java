package dao;

import model.Employee;

public class DepartmentReport {
  private Double averageSalary; // check
  private String code; // check
  private int employeeCount; // check
  private Employee topWageEmployee; //check

  public void setAverageSalary(double averageSalary) {
    this.averageSalary = averageSalary;
  } 
  public void setCode(String code) {
    this.code = code;
  }

  public void setEmployeeCount(Integer count) {
    this.employeeCount = count;
  }

  public int getEmployeeCount() {
    return this.employeeCount;
  }

  public void setTopWageEmployee(Employee emp) {
    this.topWageEmployee = emp;
  }

  public Employee getTopWagEmployee() {
    return this.topWageEmployee;
  }


  public String toString() {

    return "code: " + this.code + ", averageSalary: "
    + this.averageSalary + ", employeeCount: " + this.employeeCount
    + ", topWageEmployee: " + this.topWageEmployee;


  }
}