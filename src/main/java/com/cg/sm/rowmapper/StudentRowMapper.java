package com.cg.sm.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.cg.sm.dto.Student;

public class StudentRowMapper implements RowMapper<Student> {

	@Override
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {

		Student students = new Student();

		students.setId(rs.getInt("id"));
		students.setName(rs.getString("name"));
		students.setMobile(rs.getLong("mobile"));
		students.setCountry(rs.getString("country"));
		return students;
	}

}
