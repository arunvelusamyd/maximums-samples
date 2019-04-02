package com.flexy.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

/**
 * Created by arunv on 11/10/16.
 */

@Document(collection = "studentdocs")
public class Student implements Serializable {

    public String getStudentDocId() {
        return studentDocId;
    }

    public void setStudentDocId(String studentDocId) {
        this.studentDocId = studentDocId;
    }

    @Id
    private String studentDocId;

    private String studentId;

    private String studentName;

    private String dob;

    private String contactNo;

    private Address address;

    private StudentCourse studentCourse;

    private Set<MonthAttendance> monthAttendances;

    private Set<Subject> subjects;

    public Set<MonthAttendance> getMonthAttendances() {
        return monthAttendances;
    }

    public void setMonthAttendances(Set<MonthAttendance> monthAttendances) {
        this.monthAttendances = monthAttendances;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public StudentCourse getStudentCourse() {
        return studentCourse;
    }

    public void setStudentCourse(StudentCourse studentCourse) {
        this.studentCourse = studentCourse;
    }

    public Set<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(Set<Subject> subjects) {
        this.subjects = subjects;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

}
