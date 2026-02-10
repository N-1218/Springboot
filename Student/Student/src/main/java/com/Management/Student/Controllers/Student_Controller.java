package com.Management.Student.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Management.Student.Entity.Student;
import com.Management.Student.Repository.Student_Repository;
import com.Management.Student.Service.Student_Service;

@RestController
@RequestMapping("/Student_Controller")
public class Student_Controller {
	
	@Autowired 
	private Student_Service studentservice;
	
	//Post Mapping
	@PostMapping("/add-Student")
	public Student addstudent(@RequestBody Student student) {
		System.out.println("Student roll number : "+student.getId()+"Student name is : "+student.getName()+"Department name :"+student.getDepartment());
		return studentservice.post(student);
	}
	
	//Get Mapping
    @GetMapping("/get-Students")
	public List<Student> getAllStudents() {
	 return studentservice.getallstudents();
	 }
}
