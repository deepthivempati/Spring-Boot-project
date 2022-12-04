package com.mainClass.controllerClasses;

import com.mainClass.modelClasses.Courses;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {
    @RequestMapping("/courses")
    public List<Courses> getAllCourses(){
        return Arrays.asList(new Courses(1,"java"), new Courses(2,"spring"));
    }
}
