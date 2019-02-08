package com.flexy.domain.repository;

import com.flexy.domain.model.Course;
import com.flexy.domain.service.StudentService;
import io.crnk.core.queryspec.QuerySpec;
import io.crnk.core.repository.ResourceRepositoryBase;
import io.crnk.core.resource.list.DefaultResourceList;
import io.crnk.core.resource.list.ResourceList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CourseRepositoryImpl extends ResourceRepositoryBase<Course, Long> {

	@Autowired
	private StudentService studentService;

	public CourseRepositoryImpl() {
		super(Course.class);
	}

	@Override
	public ResourceList<Course> findAll(QuerySpec querySpec) {
		ResourceList<Course> courseResourceList = new DefaultResourceList<>();
		List<Course> courses = studentService.getAllCourses();
		courseResourceList.addAll(courses);
		return courseResourceList;
	}

}
