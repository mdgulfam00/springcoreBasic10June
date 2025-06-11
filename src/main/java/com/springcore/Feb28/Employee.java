package com.springcore.Feb28;

public class Employee {
    private int employeeId;
    private String empName;
    private Department department;

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }
    public Employee(int employeeId,String empName,Department department){
        this.employeeId=employeeId;
        this.empName=empName;
        this.department=department;
    }

    public void display(){
        System.out.println(employeeId);
        System.out.println(empName);
        System.out.println(department);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", empName='" + empName + '\'' +
                ", department=" + department +
                '}';
    }
}
