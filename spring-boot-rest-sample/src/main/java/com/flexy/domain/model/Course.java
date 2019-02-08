package com.flexy.domain.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.crnk.core.resource.annotations.JsonApiId;
import io.crnk.core.resource.annotations.JsonApiResource;
import lombok.Data;

@JsonApiResource(type = "courses")
@Data
public class Course {

	@JsonApiId
	private int courseId;

	@JsonProperty("course-name")
	private String courseName;

}
