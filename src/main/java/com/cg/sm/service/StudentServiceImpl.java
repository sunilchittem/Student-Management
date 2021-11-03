package com.cg.sm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.sm.DAO.StudentDao;
import com.cg.sm.dto.Student;

@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	private StudentDao studentDao;

	@Override
	public List<Student> loadStudent() {

		List<Student> studentList = studentDao.loadStudents();

		return studentList;
	}

	@Override
	public void saveStudent(Student student) {

		if (student.getCountry().equals("UK")) {

			System.out.println("sent mail" + student.getName());
		}

		studentDao.saveStudent(student);

	}

	@Override
	public Student updateStudent(int id) {

		return studentDao.updateStudent(id);
	}

	@Override
	public void updateChanges(Student student) {

		studentDao.updateChanges(student);

	}

	@Override
	public void deleteStudent(int id) {

		studentDao.deleteStudent(id);

	}

	@Override
	public Student findStudent(String text) {
		
		Student studentReslt = studentDao.findStudent(text);
		
		return studentReslt;
	}

}
