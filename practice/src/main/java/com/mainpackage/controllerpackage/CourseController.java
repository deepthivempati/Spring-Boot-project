package com.mainpackage.controllerpackage;

import com.mainpackage.modelpackage.Courses;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/courses")
public class CourseController {
    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<Courses> getAllCourses() {
        return Arrays.asList(new Courses(1,"java"), new Courses(2,"spring"));
    }
}
