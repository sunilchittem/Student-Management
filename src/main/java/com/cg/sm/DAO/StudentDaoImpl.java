package com.cg.sm.DAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.cg.sm.dto.Student;
import com.cg.sm.rowmapper.StudentRowMapper;

@Repository
public class StudentDaoImpl implements StudentDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public List<Student> loadStudents() {
		String sql = "select * from students";
		List<Student> studentList = jdbcTemplate.query(sql, new StudentRowMapper());
		return studentList;
	}

	@Override
	public void saveStudent(Student student) {

		String sql = "insert into students(name,mobile,country) values(?,?,?)";

		Object[] args = { student.getName(), student.getMobile(), student.getCountry() };

		jdbcTemplate.update(sql, args);

		System.out.println("record saved");
	}

	@Override
	public Student updateStudent(int id) {

		String sql = "select * from students where id=?";

		Student student = jdbcTemplate.queryForObject(sql, new StudentRowMapper(), id);

		return student;
	}

	@Override
	public void updateChanges(Student student) {

		String sql = "update students set name=?,mobile=?,country=? where id=?";

		Object[] orgs = { student.getName(), student.getMobile(), student.getCountry(), student.getId() };

		jdbcTemplate.update(sql, orgs);

	}

	@Override
	public void deleteStudent(int id) {

		String sql = "delete from students where id=?";

		jdbcTemplate.update(sql, id);

	}

	@Override
	public Student findStudent(String text) {

		String sql = "select id, name, mobile, country from students where name=?";

		Student queryForObject = jdbcTemplate.queryForObject(sql, new StudentRowMapper(), text);

		return queryForObject;
	}

}
