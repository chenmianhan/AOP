package com.thoughtworks.springbootemployee.controller;

import com.thoughtworks.springbootemployee.model.Student;
import com.thoughtworks.springbootemployee.service.StudentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentController {
    @GetMapping("/coding")
    public void coding(){
        StudentService studentService=new StudentService();
        Student student=new Student("18",1,"sleeping");
        studentService.coding(student);

    }
    @GetMapping("/sitting")
    public void sitting(){
        StudentService studentService=new StudentService();
        Student student=new Student("18",1,"sleeping");
        studentService.sitting(student);

    }
    @GetMapping("/sleeping")
    public void sleeping() throws Exception {
        StudentService studentService=new StudentService();
        Student student=new Student("18",1,"coding");

            studentService.sleeping(student);


    }

}
