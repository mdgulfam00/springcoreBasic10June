package com.springcore.March02;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Student {
    private int id;
    private String name;
    private int rollNumber;
    private List<String> subjects;
    private Set<String> subjectCode;
    private Map<String,Integer> subjectDescription;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<String> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<String> subjects) {
        this.subjects = subjects;
    }

    public Set<String> getSubjectCode() {
        return subjectCode;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setSubjectCode(Set<String> subjectCode) {
        this.subjectCode = subjectCode;
    }

    public Map<String, Integer> getSubjectDescription() {
        return subjectDescription;
    }

    public void setSubjectDescription(Map<String, Integer> subjectDescription) {
        this.subjectDescription = subjectDescription;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", rollNumber=" + rollNumber +
                ", subjects=" + subjects +
                ", subjectCode=" + subjectCode +
                ", subjectDescription=" + subjectDescription +
                '}';
    }
}
