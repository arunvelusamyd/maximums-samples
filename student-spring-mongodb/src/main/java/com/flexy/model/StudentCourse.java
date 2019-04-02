package com.flexy.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

/**
 * Created by arunv on 12/10/16.
 */
public class StudentCourse implements Serializable {

    private String courseId;

    private String courseName;

    private String department;

    private String classLocation;

    private String hod;

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getClassLocation() {
        return classLocation;
    }

    public void setClassLocation(String classLocation) {
        this.classLocation = classLocation;
    }

    public String getHod() {
        return hod;
    }

    public void setHod(String hod) {
        this.hod = hod;
    }
}
