package com.flexy.domain.service;

import com.flexy.domain.model.Course;
import com.flexy.domain.model.Student;
import com.flexy.domain.store.StudentStore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class StudentService {

    @Autowired
    private StudentStore studentStore;

    public List<Student> getAllStudents() {
        return studentStore.findAllStudentsWithCourse();
    }

    public List<Course>  getAllCourses() {
        return studentStore.findAllCourses();
    }

}
