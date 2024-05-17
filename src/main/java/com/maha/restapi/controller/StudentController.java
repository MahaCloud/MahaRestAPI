package com.maha.restapi.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

	//@GetMapping(path="/restapi/student", produces = {MediaType.APPLICATION_XML_VALUE}  )
	@GetMapping("/restapi/student")
	public StudentBean getStudent() throws IOException{
		return new StudentBean("Maha","Gowda");
	}
	
	
	@GetMapping("/restapi/students")
	public List<StudentBean> getStudents(){
		List<StudentBean> students = new ArrayList<>();
		students.add(new StudentBean("Maha","Gowda"));
		students.add(new StudentBean("Maha2","Gowda2"));
		students.add(new StudentBean("Maha3","Gowda3"));
		return students;
	}
	
	//http://localhost:8080/restapi/student/Maha/Gowda
	//@PathVariable to bind path variable to method variables 
	@GetMapping("/restapi/student/{firstName}/{lastName}")
	
	public StudentBean studentPathVariable(@PathVariable("firstName") String firstName, @PathVariable("lastName") String lastName) {
		
		return new StudentBean(firstName,lastName);
		
	}
	
	//Query Parameters (http://localhost:8080/restapi/student?firstName=Maha&lastName=Gowda)
	@GetMapping("/restapi/student/query")
  public StudentBean studentQueryParam(
		  @RequestParam("firstName") String firstName, 
		  @RequestParam("lastName")  String lastName) {
		
		return new StudentBean(firstName,lastName);
		
	}
}
