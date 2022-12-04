package com.deepthi.practice;

import com.deepthi.practice.Courses.Courses;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {
    List<Courses> getAllCourses(){
        return Arrays.asList(new Courses(1,"java"), (new Courses(2,"spring")));
    }
}
