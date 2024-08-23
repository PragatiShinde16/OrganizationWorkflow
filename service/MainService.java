package com.project.OrganizationManagementWorkflow.service;

import java.util.HashMap;
import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.OrganizationManagementWorkflow.dao.MainDao;
import com.project.OrganizationManagementWorkflow.entity.Country;
import com.project.OrganizationManagementWorkflow.entity.Employee;

@Service
public class MainService {

	@Autowired
	MainDao dao;
	
	public String addCountry(Country country) {
		// TODO Auto-generated method stub
		String msg = dao.addCountry(country);
		if (Objects.isNull(msg)) {
			msg = "Country is not added";
		}
		return msg;
	}

	public String updateCountry(Country country, int cid) {
		// TODO Auto-generated method stub
		String str = dao.updateCountry(country, cid);
		if (Objects.isNull(str)) {
			str = "Country is not Updated";
		}
		return str;
	}

	public String deleteCountry(int cid) {
		// TODO Auto-generated method stub
		String str = dao.deleteCountry(cid);
		if (Objects.isNull(str)) {
			str = "Country is not Deleted";
		}
		return str;
	}

	public List<Country> getAllCountry() {
		// TODO Auto-generated method stub
		List<Country> list = dao.getAllCountry();
		if (Objects.isNull(list)) {
			list = null;
		}
		return list;
	}

	public Country getParticularContry(int cid) {
		// TODO Auto-generated method stub
		Country country = dao.getParticularContry(cid);
		if (Objects.isNull(country)) {
			country = null;
		}
		return country;
	}

	public String addEmp(Employee employee) {
		// TODO Auto-generated method stub
		String string = dao.addEmp(employee);
		if (Objects.isNull(string)) {
			string = "Employee is not be added";
		}
		return string;
	}

	public String updateEmp(Employee employee, int id) {
		// TODO Auto-generated method stub
		String str = dao.updateEmp(employee, id);
		if (Objects.isNull(str)) {
			str = "Country is not Updated";
		}
		return str;
	}

	public String deleteEmp(int id) {
		// TODO Auto-generated method stub
		String str = dao.deleteEmp(id);
		if (Objects.isNull(str)) {
			str = "Employee is not Deleted";
		}
		return str;
	}

	public List<Employee> getAllEmp() {
		// TODO Auto-generated method stub
		List<Employee> list = dao.getAllEmp();
		if (Objects.isNull(list)) {
			list = null;
		}
		return list;
	}

	public Employee getParticularEmp(int id) {
		// TODO Auto-generated method stub
		Employee employee = dao.getParticularEmp(id);
		if (Objects.isNull(employee)) {
			employee = null;
		}
		return employee;
	}

	public HashMap login(Employee employee) {
		// TODO Auto-generated method stub
		Employee employee2 = dao.login(employee);
		
		HashMap map = new HashMap();
		if (Objects.isNull(employee2)) {
			map.put("msg", "Invalid User");
		}else {
			map.put("msg", "Valid User");
		}
		map.put("user", employee2);
		return map;
	}

	public List<Employee> getSalary(Double startSal, Double endSal) {
		// TODO Auto-generated method stub
		List<Employee> list = dao.getSalary(startSal, endSal);
		if (Objects.isNull(list)) {
			list = null;
		}
		return list;
	}

	public List<Employee> getStatus(String status) {
		// TODO Auto-generated method stub
		List<Employee> list = dao.getStatus(status);
		if (Objects.isNull(list)) {
			list = null;
		}
		return list;
	}

	public String updateEmpStatus(int id) {
		// TODO Auto-generated method stub
		String str = dao.updateEmpStatus(id);
		return str;
	}
	
}
