package com.tecsup.gestion.services;

import com.tecsup.gestion.exception.DAOException;
import com.tecsup.gestion.exception.EmptyResultException;
import com.tecsup.gestion.model.Departments;

public interface DepartmentsService {
	
	Departments find(int department_id) throws DAOException, EmptyResultException;

}
