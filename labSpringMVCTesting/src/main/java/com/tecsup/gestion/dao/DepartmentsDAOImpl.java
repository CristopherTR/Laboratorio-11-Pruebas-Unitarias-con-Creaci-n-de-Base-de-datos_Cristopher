package com.tecsup.gestion.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.tecsup.gestion.exception.DAOException;
import com.tecsup.gestion.exception.EmptyResultException;
import com.tecsup.gestion.mapper.DepartmentsMapper;
import com.tecsup.gestion.model.Departments;

@Repository
public class DepartmentsDAOImpl implements DepartmentsDAO {

	private static final Logger logger = LoggerFactory.getLogger(DepartmentsDAOImpl.class);

	@Autowired
	private JdbcTemplate jdbcTemplate;


	@Override
	public Departments findDepartments(int department_id) throws DAOException, EmptyResultException {

		String query = "SELECT department_id, name, description, city, department_id "
				+ " FROM departments WHERE department_id = ?";

		Object[] params = new Object[] { department_id };

		try {

			Departments depa = (Departments) jdbcTemplate.queryForObject(query, params, new DepartmentsMapper());
			//
			return depa;
			//return null;

		} catch (EmptyResultDataAccessException e) {
			throw new EmptyResultException();
		} catch (Exception e) {
			logger.info("Error: " + e.getMessage());
			throw new DAOException(e.getMessage());
		}
	}
}