package com.project.OrganizationManagementWorkflow.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.OrganizationManagementWorkflow.entity.Country;
import com.project.OrganizationManagementWorkflow.entity.Employee;
import com.project.OrganizationManagementWorkflow.service.MainService;

@CrossOrigin
@RestController
@RequestMapping("api")
public class MainController {

	@Autowired
	MainService service;
	
//	Create api to insert country
	
	@PostMapping("addcountry")
	public String addCountry(@RequestBody Country country) {
		String str = service.addCountry(country);
		return str;
	}
	
//	Create api to update country
	
	@PutMapping("update/{cid}")
	public String updateCountry(@RequestBody Country country, @PathVariable int cid) {
		String str = service.updateCountry(country, cid);
		return str;
	}
	
//	Create api to delete country
	
	@DeleteMapping("delete/{cid}")
	public String deleteCountry(@PathVariable int cid) {
		String string = service.deleteCountry(cid);
		return string;
	}
	
//	Create api to get all country
	
	@GetMapping("allcountry")
	public List<Country> getAllCountry() {
		List<Country> list = service.getAllCountry();
		return list;
	}
	
//	Create api to get perticular country by id
	
	@GetMapping("perticularRecord/{cid}")
	public Country getParticularContry(@PathVariable int cid) {
		Country country = service.getParticularContry(cid);
		return country;
	}
	
	@PostMapping("addemp")
	public String addEmp(@RequestBody Employee employee) {
		String str = service.addEmp(employee);
		return str;
	}
	
	@PutMapping("updateemp/{id}")
	public String updateEmp(@RequestBody Employee employee, @PathVariable int id) {
		String str = service.updateEmp(employee, id);
		return str;
	}
	
	@DeleteMapping("deleteemp/{id}")
	public String deleteEmp(@PathVariable int id) {
		String string = service.deleteEmp(id);
		return string;
	}
	
	@GetMapping("allemp")
	public List<Employee> getAllEmp() {
		List<Employee> list = service.getAllEmp();
		return list;
	}
	
	@GetMapping("perticularRecordemp/{id}")
	public Employee getParticularEmp(@PathVariable int id) {
		Employee employee = service.getParticularEmp(id);
		return employee;
	}
	
	@PostMapping("login")
	public HashMap login(@RequestBody Employee employee) {
		HashMap map = service.login(employee);
		return map;
	}
	
//	Create Api for whose salary in between 1000 to 5000
	
	@GetMapping("salaryapi/{startSal}/{endSal}")
	public List<Employee> getSalary(@PathVariable Double startSal, @PathVariable Double endSal) {
		List<Employee> list = service.getSalary(startSal, endSal);
		return list;
	}
	
//	create api for status
	
	@GetMapping("statusapi/{status}")
	public List<Employee> getStatus(@PathVariable String status) {
		List<Employee> list = service.getStatus(status);
		return list;
	}
	
//	Create api for update employee status
	
	@GetMapping("updateempstatus/{id}")
	public String updateEmpStatus(@PathVariable int id) {
		String str = service.updateEmpStatus(id);
		return str;
	}
	
	
}
