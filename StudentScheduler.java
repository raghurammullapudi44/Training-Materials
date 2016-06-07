package studentscheduler;

import java.util.Arrays;

import student.Student;

public class StudentScheduler {
	
	private Student[] students=new Student[10];
	private int counterStudent;
	
	public String addStudent(int rollNumber,String name,String[] coursesNames)
	{
		if(validationOfrollNumber(rollNumber) == null)
		{
			students[counterStudent++]=new Student(rollNumber,name,coursesNames);
			return "student added successfully";
		}
		else
		{
			return "student not added,roll number already exists";
		}
	}
	
	public Student[] showAllStudentDetails()
	{
		return Arrays.copyOfRange(students,0,counterStudent);
	}
	
	public Student showIndividualStudentDetails(int rollNumber)
	{
		return validationOfrollNumber(rollNumber);
	}
	
	public Student validationOfrollNumber(int rollNumber)
	{
		for(int i=0;i<counterStudent;i++)
		{
			if(students[i].getRollNumber() == rollNumber)
			{
				return students[i];
			}
		}
		return null;
	}
	
	public Student courseCountByName(String Name)
	{
		for(int i=0;i<counterStudent;i++)
		{
			if(students[i].getName().equals(Name))
			{
				return students[i];
			}
		}
		return null;
	}

}
