package com.ibm.dao;

import java.util.List;

import com.ibm.model.Employee;



public interface EmployeeDAO {
	
	List<Employee> get();
	
	Employee get(int id);
	
	boolean save(Employee employee);
	
	boolean delete(int id);
	
	boolean update(Employee employee);
}
