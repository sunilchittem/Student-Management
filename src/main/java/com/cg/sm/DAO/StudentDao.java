package com.cg.sm.DAO;

import java.util.List;

import com.cg.sm.dto.Student;

public interface StudentDao {
	
	public List<Student> loadStudents();
	
	public void saveStudent(Student student);
	
	public Student updateStudent(int id);
	
	public void updateChanges(Student student);
	
	public void deleteStudent(int id);
	
	public Student findStudent(String text);

}
