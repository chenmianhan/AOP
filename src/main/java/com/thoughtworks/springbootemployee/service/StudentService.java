package com.thoughtworks.springbootemployee.service;


import com.thoughtworks.springbootemployee.model.Student;

public class StudentService {
    public String coding(Student student){
        student.setStatus("coding");
        return "I am coding";
    }
    public String sleeping(Student student) throws Exception {
        if(student.getStatus().equals("coding")){
            System.out.println(student.getStatus());
            throw new Exception("you are coding cannot sleeping");
        }

        student.setStatus("sleeping");
        return "I am Sleeping";
    }
    public String eating(Student student){
        student.setStatus("eating");
        return "I am eating";
    }
    public void sitting(Student student){

    }

}
