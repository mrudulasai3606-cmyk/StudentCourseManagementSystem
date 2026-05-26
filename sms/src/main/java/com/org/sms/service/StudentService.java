package com.org.sms.service;

import com.org.sms.entity.Course;
import com.org.sms.entity.Student;
import com.org.sms.repository.CourseRepository;
import com.org.sms.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;
    @Autowired
    private CourseRepository courseRepository;
    public Student addStudent(Student student) {
        return studentRepository.save(student);
    }

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }
    public void deleteStudent(Long id){

        studentRepository.deleteById(id);

    }

    public void registerStudentToCourse(
            Long studentId,
            Long courseId){

        Student student =
                studentRepository.findById(studentId)
                        .orElse(null);

        Course course =
                courseRepository.findById(courseId)
                        .orElse(null);

        if(student != null && course != null){

            student.getCourses().add(course);

            studentRepository.save(student);
        }
    }
}