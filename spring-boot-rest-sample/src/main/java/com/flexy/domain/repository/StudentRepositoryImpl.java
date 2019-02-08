package com.flexy.domain.repository;

import com.flexy.domain.model.Student;
import com.flexy.domain.service.StudentService;
import io.crnk.core.queryspec.QuerySpec;
import io.crnk.core.repository.ResourceRepositoryBase;
import io.crnk.core.resource.list.DefaultResourceList;
import io.crnk.core.resource.list.ResourceList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class StudentRepositoryImpl extends ResourceRepositoryBase<Student, Long> {

    protected StudentRepositoryImpl() {
        super(Student.class);
    }

    @Autowired
    private StudentService studentService;

    @Override
    public ResourceList<Student> findAll(QuerySpec querySpec) {
        ResourceList<Student> studentResourceList = new DefaultResourceList<>();
        List<Student> students = studentService.getAllStudents();
        studentResourceList.addAll(students);
        return studentResourceList;
    }
}
