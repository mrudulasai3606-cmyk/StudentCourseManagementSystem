package com.org.sms.controller;

import com.org.sms.entity.Course;
import com.org.sms.service.CourseService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class CourseController {

    @Autowired
    private CourseService courseService;

    @GetMapping("/courses")
    public String getCourses(Model model){

        model.addAttribute(
                "courses",
                courseService.getAllCourses()
        );

        model.addAttribute(
                "course",
                new Course()
        );

        return "courses";
    }

    @PostMapping("/saveCourse")
    public String saveCourse(@ModelAttribute Course course){

        courseService.addCourse(course);

        return "redirect:/courses";
    }

    @GetMapping("/deleteCourse/{id}")
    public String deleteCourse(@PathVariable Long id){

        courseService.deleteCourse(id);

        return "redirect:/courses";
    }
}