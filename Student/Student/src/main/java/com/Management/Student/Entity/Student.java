package com.Management.Student.Entity;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
int id;
String name;
String department;
String Special_Subject;


//Setter and Getter

public String getName() {
	return name;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public void setName(String name) {
	this.name = name;
}
public String getDepartment() {
	return department;
}
public void setDepartment(String department) {
	this.department = department;
}
public String getSpecial_Subject() {
	return Special_Subject;
}
public void setSpecial_Subject(String special_Subject) {
	Special_Subject = special_Subject;
}

}
