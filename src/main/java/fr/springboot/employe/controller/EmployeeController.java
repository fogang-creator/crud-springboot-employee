package fr.springboot.employe.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import fr.springboot.employe.model.Employee;
import fr.springboot.employe.repository.EmployeeRepository;

@RestController
@RequestMapping("/api/v1")
public class EmployeeController {
	
	
	@Autowired
	private EmployeeRepository  employeeRepository;
	
	//get All Employee
	@GetMapping("/employees")
	public List<Employee> getAllEmployees(){
		return employeeRepository.findAll();
	}
	
	//post all Employee
	@PostMapping("/save")
	public Employee saveEmployee(@RequestBody Employee employee) {
	       return employeeRepository.save(employee);
		//System.out.println( employeeRepository.save(employee));
		 //System.out.println(employee);
	}
	
	//put all Employee
		@PutMapping("/update")
		public Employee updateEmployee(@RequestBody Employee employee) {
			System.out.println(" Employee test");
			return employeeRepository.save(employee);
		}

	
	//delete Employee
	@DeleteMapping("delete")
	public String deleteEmploye(@RequestParam String id) {
		employeeRepository.deleteById(id);
		return "Employee delete";
	}

}
