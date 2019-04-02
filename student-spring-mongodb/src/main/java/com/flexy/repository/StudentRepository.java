package com.flexy.repository;

import com.flexy.model.Student;
import com.flexy.model.StudentCourse;
import org.springframework.data.repository.CrudRepository;

import java.util.Collection;

/**
 * Created by arunv on 28/11/16.
 */
public interface StudentRepository extends CrudRepository<Student, String> {

    Iterable<Student> findByContactNo(String contactNo);

    Iterable<Student> findByStudentCourseCourseId(String courseId);

}
