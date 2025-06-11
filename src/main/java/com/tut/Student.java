package com.tut;

public class Student {
    private int studentId;
    private String studentName;
    private String studentAddress;
    public int getStudentId() {
        return studentId;
    }
    @Override
    public String toString() {
        return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentAddress=" + studentAddress
                + "]";
    }
    public Student() {
        super();
        // TODO Auto-generated constructor stub
    }
    public Student(int studentId, String studentName, String studentAddress) {
        super();
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentAddress = studentAddress;
    }
    public void setStudentId(int studentId) {
        System.out.println("Getting Id...");
        this.studentId = studentId;
    }
    public String getStudentName() {
        return studentName;
    }
    public void setStudentName(String studentName) {
        System.out.println("Getting Name....");
        this.studentName = studentName;
    }
    public String getStudentAddress() {
        return studentAddress;
    }
    public void setStudentAddress(String studentAddress) {
        System.out.println("Getting Address..");
        this.studentAddress = studentAddress;
    }

}
