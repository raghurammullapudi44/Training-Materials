package com.capgemini;

import javax.persistence.*;
@Entity
public class Employee {

	@Id private int id;
	private String name;
	private int salary;
	@ManyToOne
	@JoinColumn(name="departmentId",insertable=true,updatable=true,nullable=false)
	private Department department;

	public Employee()
	{
		
	}

	public Employee(int id)
	{
		this.id=id;	
	}

	public int getId()
	{
		return id;
	}

	public void setId(int id) 
	{
		this.id = id;
	}

	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public int getSalary() 
	{
		return salary;
	}

	public void setSalary(int salary)
	{
		this.salary = salary;
	}
	
	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	
	@Override
	public String toString() 
	{
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ",[departmentID="+ department.getDepartmentId() + ",departmentName="+ department.getDepartmentName() +" ]]";
	}
}
