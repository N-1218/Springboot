package com.Management.Student.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Management.Student.Entity.Student;
import com.Management.Student.Repository.Student_Repository;

@Service
public class Student_Service {
	@Autowired
	private Student_Repository studentRepository;
	
public  List<Student>getallstudents(){
 List<Student>Stud=studentRepository.findAll();
 return Stud;
}
public Student post(Student student) {
	return studentRepository.save(student);
}
}
