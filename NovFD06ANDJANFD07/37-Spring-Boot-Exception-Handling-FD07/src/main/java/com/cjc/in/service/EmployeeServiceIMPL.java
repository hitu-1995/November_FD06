package com.cjc.in.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.cjc.in.exceptions.IdLengthNotMatchException;
import com.cjc.in.exceptions.IdNotFoundException;
import com.cjc.in.model.Employee;
@Service
public class EmployeeServiceIMPL implements EmployeeService{

	List<Employee> empList = new ArrayList<Employee>();
	@Override
	public void insertEmployee(Employee emp) {
		System.out.println(emp.getEid());
	     if(emp.getEid()<99 || emp.getEid()>999)
	    	 throw new IdLengthNotMatchException();
	    else if(emp.getEname().isEmpty()) {
			throw new NullPointerException();
		 }
		 else {
			 empList.add(emp);
		 }
	}
	@Override
	public Employee getEmployee(int id) {
    
		 Employee emp=null;
		 boolean flag = false;
	      for(Employee e : empList) {
	    	  if(e.getEid()==id)
	    	  {
	    		  emp=e;
	    		  flag = true;
	    	  }
	    	  break;
	      }
	      if(flag)
	    	  return emp;
	      else
	    	  throw new IdNotFoundException();
	}

}
