package com.cg.sm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cg.sm.dto.Student;
import com.cg.sm.service.StudentService;

@Controller
public class StudentController {

	@Autowired
	private StudentService studentService;

	@GetMapping("/showstudents")
	public String studentList(Model model) {

		List<Student> studentsList = studentService.loadStudent();

		model.addAttribute("students", studentsList);
		return "student-list";
	}

	@GetMapping("/addStudent")
	public String addStudent(Model model) {

		Student student = new Student();

		model.addAttribute("student", student);

		return "add-student";
	}

	@PostMapping("/save-student")
	public String saveStudent(Student student) {

		System.out.println(student);
		// code a condition if student don't have any id
		// while inserting id will be '0' because that field is autoincrement
		
		if (student.getId() == 0) {
			studentService.saveStudent(student);
			System.out.println("if part");
		} else {
			//for updating student id will there that will be captured to hidden field
			studentService.updateChanges(student);
			System.out.println("else part");

		}
		return "redirect:/showstudents";
	}

	@GetMapping("/updateStudent")
	public String updateStudent(@RequestParam("userId") int id, @ModelAttribute("student") Student student) {
		
		// with help of @requestparam we are capturing Id
		// that id we are passing to updateStudent(id) for selecting that perticular student
		
		Student updateStudent = studentService.updateStudent(id);
		
		//we are setting data of that particular student  to entity fields 
		// to prepopulate data while updating
		
		student.setId(updateStudent.getId());
		student.setName(updateStudent.getName());
		student.setMobile(updateStudent.getMobile());
		student.setCountry(updateStudent.getCountry());
		return "add-student";
	}

	@GetMapping("/deleteStudent")
	public String deleteStudent(@RequestParam("userID") int id) {

		System.out.println("id is : " + id);
		studentService.deleteStudent(id);

		return "redirect:/showstudents";
	}
	
	@GetMapping("/find-student")
	public String findStudent(Model model, @RequestParam("findName") String text) {

		
		Student studentReslt = studentService.findStudent(text);

		model.addAttribute("students", studentReslt);
		
		return "view-student";
	}

}
