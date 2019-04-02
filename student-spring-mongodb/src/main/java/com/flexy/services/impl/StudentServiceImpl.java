package com.flexy.services.impl;

import com.flexy.model.Student;
import com.flexy.repository.StudentRepository;
import com.flexy.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import javax.ws.rs.PathParam;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by arunv on 11/10/16.
 */
@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public Map<String, Iterable<Student>> getStudentsByContactNo(String contactNo) {
        Map<String, Iterable<Student>> studentData = new HashMap<String, Iterable<Student>>();
        Iterable<Student> iStudent = studentRepository.findByContactNo(contactNo);
        studentData.put(contactNo,iStudent);
        return studentData;
    }

    public Map<String, Iterable<Student>> getStudentsByCourseId(String courseId) {
        Map<String, Iterable<Student>> studentData = new HashMap<String, Iterable<Student>>();
        Iterable<Student> iStudent = studentRepository.findByStudentCourseCourseId(courseId);
        studentData.put(courseId,iStudent);
        return studentData;
    }

    public boolean saveContactsProducts(List<Student> students) {
        Iterable<Student> resultUserProducts = studentRepository.save(students);
        if(null != resultUserProducts)
            return true;
        return false;
    }


}
