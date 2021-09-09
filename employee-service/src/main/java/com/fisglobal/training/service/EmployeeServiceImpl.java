package com.fisglobal.training.service;

import java.util.List;
import com.fisglobal.training.repository.EmployeeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fisglobal.training.model.Employee;


@Service
public class EmployeeServiceImpl  implements EmployeeService{
	@Autowired
	private EmployeeRepository employeeRepository;
	@Override
	public boolean saveEmployee(Employee employee) {
		employeeRepository.save(employee);
		return true;
	}

	@Override
	public boolean updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		employeeRepository.save(employee);
		return true;
	}

	@Override
	public boolean deleteEmployee(Integer id) {
		// TODO Auto-generated method stub
		employeeRepository.deleteById(id);
		return true;
	}

	@Override
	public Employee getById(Integer id) {
		return employeeRepository.getById(id);
		// TODO Auto-generated method stub
	}

	@Override
	public List<Employee> findAll() {
		// TODO Auto-generated method stub
		return employeeRepository.findAll();
	}

	

	@Override
	public boolean isValidEmployee(String username, String password) {
		// TODO Auto-generated method stub
		return true;
	}

}
