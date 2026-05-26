package com.org.sms.controller;

import com.org.sms.entity.Student;
import com.org.sms.service.CourseService;
import com.org.sms.service.StudentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class StudentController {

    @Autowired
    private StudentService studentService;
    @Autowired
    private CourseService courseService;
    // Home Page

    @GetMapping("/")
    public String home(){

        return "index";

    }
//    @GetMapping("/")
//    public String home(){
//
//        return "redirect:/students";
//
//    }

    // Show Students

    @GetMapping("/students")
    public String getStudents(Model model){

        model.addAttribute(
                "students",
                studentService.getAllStudents()
        );

        model.addAttribute(
                "student",
                new Student()
        );

        return "students";
    }

    // Save Student

    @PostMapping("/saveStudent")
    public String saveStudent(@ModelAttribute Student student){

        studentService.addStudent(student);

        return "redirect:/students";
    }

    // Delete Student

    @GetMapping("/deleteStudent/{id}")
    public String deleteStudent(@PathVariable Long id){

        studentService.deleteStudent(id);

        return "redirect:/students";
    }
    @GetMapping("/registerCourse")
    public String registerCoursePage(Model model){

        model.addAttribute(
                "students",
                studentService.getAllStudents()
        );

        model.addAttribute(
                "courses",
                courseService.getAllCourses()
        );

        return "register-course";
    }
    @PostMapping("/registerCourse")
    public String registerCourse(
            @RequestParam Long studentId,
            @RequestParam Long courseId){

        studentService.registerStudentToCourse(
                studentId,
                courseId
        );

        return "redirect:/students";
    }
    @GetMapping("/registeredCourses")
    public String registeredCourses(Model model){

        model.addAttribute(
                "students",
                studentService.getAllStudents()
        );

        return "registered-courses";
    }

}