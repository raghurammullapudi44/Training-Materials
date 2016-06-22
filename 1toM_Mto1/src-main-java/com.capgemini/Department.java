package com.capgemini;

import java.util.Set;

import javax.persistence.*;
@Entity
public class Department 
{

	@Id private int departmentId;
	private String departmentName;
	@OneToMany(mappedBy = "department")
	private Set<Employee> employees;
	
	public Department()
	{
	
	}
	
	public Department(int departmentId)
	{
		this.departmentId = departmentId;
	}

	public int getDepartmentId()
	{
		return departmentId;
	}
	

	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public Set<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(Employee emp) {
		
	}


	@Override
	public String toString() {
		return "Department [departmentId=" + departmentId + ", departmentName=" + departmentName + "]";
	}
	
}
