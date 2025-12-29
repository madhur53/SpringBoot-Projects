package com.example.demo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class StudentDAO {
	
	private final JdbcTemplate jdbcTemplate;
	
	public StudentDAO(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public void save(Student student) {
		String sql = "insert into student(name,course,email) values(?,?,?)";
		jdbcTemplate.update(sql, student.getName(), student.getCourse(), student.getEmail());
		
	}
	
	public List<Student> findAll(){
		String sql = "select * from student";
		return jdbcTemplate.query(sql, new RowMapper<Student>() {
			public Student mapRow(ResultSet rs, int rowNum) throws SQLException{
				return new Student(
						rs.getString("name"),
						rs.getString("course"),
						rs.getString("email"));
			}
		});
	}
	
}
