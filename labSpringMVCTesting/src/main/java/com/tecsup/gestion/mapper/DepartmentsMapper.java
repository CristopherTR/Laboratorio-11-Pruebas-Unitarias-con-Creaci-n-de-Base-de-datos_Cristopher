package com.tecsup.gestion.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.tecsup.gestion.model.Departments;

public class DepartmentsMapper implements RowMapper<Departments>{

	public Departments mapRow(ResultSet rs, int rowNum) throws SQLException {
		Departments depa = new Departments();
		depa.setDepartmentId(rs.getInt("department_id"));
		depa.setName(rs.getString("name"));
		depa.setDescription(rs.getString("description"));
		depa.setCity(rs.getString("city"));
		return depa;
	}
}
