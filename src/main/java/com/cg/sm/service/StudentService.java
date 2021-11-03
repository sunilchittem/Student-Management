package com.cg.sm.service;

import java.util.List;

import com.cg.sm.dto.Student;

public interface StudentService {

		public List<Student> loadStudent();
		
		public void saveStudent(Student student);
		
		public Student updateStudent(int id);
		
		public void updateChanges(Student student);
		
		public void deleteStudent(int id);
		
		public Student findStudent(String text);
}
