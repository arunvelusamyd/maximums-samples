package com.flexy.services;

import com.flexy.model.MonthAttendance;
import com.flexy.model.Student;
import com.flexy.model.StudentCourse;

import javax.jws.WebService;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;
import java.util.Map;

/**
 * Created by arunv on 11/10/16.
 */
@WebService(serviceName = "student")
@Consumes({MediaType.APPLICATION_JSON })
@Produces({MediaType.APPLICATION_JSON })
public interface StudentService {

    @GET
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    @Produces({ MediaType.APPLICATION_JSON })
    @Path("/student/{contactNo}")
    public Map<String, Iterable<Student>> getStudentsByContactNo(@PathParam("contactNo") String contactNo);

    @GET
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    @Produces({ MediaType.APPLICATION_JSON })
    @Path("/studentbycourse/{courseId}")
    public Map<String, Iterable<Student>> getStudentsByCourseId(@PathParam("courseId") String courseId);

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces({ MediaType.APPLICATION_JSON })
    @Path("/addstudents")
    public boolean saveContactsProducts(List<Student> students);

}
//try using this url : http://localhost:8080/services/studentdocServices/{{path./././}}