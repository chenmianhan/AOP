package com.thoughtworks.springbootemployee;

import com.thoughtworks.springbootemployee.model.Student;
import com.thoughtworks.springbootemployee.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootEmployeeApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootEmployeeApplication.class, args);
	}

}
