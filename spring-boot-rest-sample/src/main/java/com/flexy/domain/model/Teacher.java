package com.flexy.domain.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.crnk.core.resource.annotations.JsonApiId;
import io.crnk.core.resource.annotations.JsonApiResource;
import lombok.Data;

@Data
public class Teacher {

    @JsonProperty("employee-id")
    private String employeeId;

    @JsonProperty("teacher-name")
    private String teacherName;

    @JsonProperty("education-qualification")
    private String educationQualification;

    //private String homeAddress;
    //private String residentialAddress;
    //private String contactNo;
    //private String employmentStatus; //permanent ,  temporary , contract , transferred
    //private String experience;
    //private List<Subject> subjects;

}
