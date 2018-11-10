package com.tecsup.gestion.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tecsup.gestion.dao.DepartmentsDAO;
import com.tecsup.gestion.exception.DAOException;
import com.tecsup.gestion.exception.EmptyResultException;
import com.tecsup.gestion.model.Departments;

@Service
public class DepartmentsServicelmpl implements DepartmentsService {

	@Autowired
	private DepartmentsDAO DepartmentsDAO;

	@Override
	public Departments find(int department_id) throws DAOException, EmptyResultException {
		
		Departments depa = DepartmentsDAO.findDepartments(department_id);

		return depa;
	}

}
