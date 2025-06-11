package com.springcore.Feb28;

public class Department {
    private String department;

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return "Department{" +
                "department='" + department + '\'' +
                '}';
    }
}
