package com.flexy.domain.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.crnk.core.resource.annotations.JsonApiId;
import io.crnk.core.resource.annotations.JsonApiRelation;
import io.crnk.core.resource.annotations.JsonApiResource;
import io.crnk.core.resource.annotations.SerializeType;
import lombok.Data;

import java.util.List;

@JsonApiResource(type = "students")
@Data
public class Student {

    @JsonApiId
    private int studentId;

    @JsonProperty("student-name")
    private String studentName;

    private String gender;

    @JsonApiRelation(serialize = SerializeType.EAGER)
    @JsonProperty("device-info")
    private DeviceInfo deviceInfo;

    @JsonApiRelation(serialize = SerializeType.EAGER)
    private List<Course> courses;

    @JsonProperty("level-and-section")
    private String levelAndSection;

    @JsonProperty("class-teacher")
    private Teacher classTeacher;

}
