package com.ninja.springboot_java_hibernate_test;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController 
{
	@Autowired
	EmployeeRepository erepo;
	@RequestMapping("/test")
	public String test()
	{
		return "this is test only";
	}
	

	@RequestMapping("/save")
	public String save(@RequestBody Employee employee)
	
	{
		erepo.save(employee);
		return "data saved into table";
	}
	
@RequestMapping("/all")
public List<Employee> alldata()
{
	return erepo.findAll();
			
}
@RequestMapping("/by/{name}")
public List<Employee> byname(@PathVariable String name)
{
	return erepo.findByName(name);
}
}
