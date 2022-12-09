package model;


public class Employee {
    private int id;
    private String name;
    private Department department;
    double salary;

    public Employee (int id, String name, Department department, double salary) {this.id=id; this.name=name;this.department=department;this.salary=salary;}

    public Department getDepartment() {
        return department;
    }

    // TODO: Probably needs more code. Can be done in a cup of coffee according to the PM

}