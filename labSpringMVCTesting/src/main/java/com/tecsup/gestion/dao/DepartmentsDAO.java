package com.tecsup.gestion.dao;

import com.tecsup.gestion.exception.DAOException;
import com.tecsup.gestion.exception.EmptyResultException;
import com.tecsup.gestion.model.Departments;

public interface DepartmentsDAO {

	Departments findDepartments(int id) throws DAOException, EmptyResultException;

}
