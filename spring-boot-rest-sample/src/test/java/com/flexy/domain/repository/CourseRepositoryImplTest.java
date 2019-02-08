package com.flexy.domain.repository;

import com.flexy.domain.model.Course;
import com.flexy.domain.service.StudentService;
import com.flexy.domain.store.StudentStore;
import io.crnk.core.queryspec.QuerySpec;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.test.util.ReflectionTestUtils;

import java.util.List;

import static org.junit.Assert.*;

public class CourseRepositoryImplTest {

    @Test
    public void findAll() {
        StudentStore studentStore = new StudentStore();
        StudentService studentService = new StudentService();
        ReflectionTestUtils.setField(studentService, "studentStore", studentStore);

        CourseRepositoryImpl courseRepository = new CourseRepositoryImpl();
        ReflectionTestUtils.setField(courseRepository, "studentService", studentService);

        List<Course> courses = courseRepository.findAll(new QuerySpec(CourseRepositoryImpl.class));

        Assert.assertTrue(courses.size()>1);
    }
}