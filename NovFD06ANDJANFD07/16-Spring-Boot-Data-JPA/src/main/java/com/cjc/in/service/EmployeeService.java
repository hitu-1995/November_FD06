package com.cjc.in.service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.in.model.Employee;
import com.cjc.in.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository repo;

	public void check() {
		 saveEmployee();
		// inserAll();
		// getSingle();
		// getAll();
		//getAllbyId();
		//  deleteSingle();
		  
	
	}

	public void deleteSingle() {
		repo.deleteById(104);
	      System.out.println("** Employee Record Deleted ** ");
	}

	public void getAllbyId() {
		List<Integer> list = Arrays.asList(102, 10488);

		Iterable<Employee> allById = repo.findAllById(list);

		for (Employee emp : allById) {

			System.out.println("------------------------");
			System.out.println(emp);
			System.out.println("------------------------");
		}
	}

	public void getAll() {
		List<Employee> all = (List<Employee>) repo.findAll();
		for (Employee emp : all) {

			System.out.println("------------------------");
			System.out.println(emp);
			System.out.println("------------------------");
		}

	}

	public void getSingle() {
		Optional<Employee> optional = repo.findById(1029);
		if (optional.isPresent()) {
			Employee employee = optional.get();
			System.out.println(employee);
		} else {
			System.out.println("Employee Not Present ....");
		}
	}

	public void inserAll() {
		List<Employee> list = Arrays.asList(new Employee(102, "Rohit", "Mumbai"), new Employee(103, "Rishabh", "Delhi"),
				new Employee(104, "Dhoni", "Chennai"));

		repo.saveAll(list);
		System.out.println("*** List Records Insertded ***");
	}

	public void saveEmployee() {
		Employee emp = new Employee(101, "Virat", "Banglore");
		repo.save(emp);
		System.out.println("  *** Record Inserted ***");
	}
}
