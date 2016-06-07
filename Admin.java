package admin;

import java.util.Scanner;

import student.Student;
import studentscheduler.StudentScheduler;


public class Admin {
	private static Scanner sc=new Scanner(System.in);
	private static StudentScheduler studSch=new StudentScheduler();
	public static void main(String[] args) {
		showMenu();

	}

	private static void showMenu() {
		int choice;
		while(true)
		{
			System.out.println("---------------------");
			System.out.println("Menu");
			System.out.println("---------------------");
			System.out.println("1.add student");
			System.out.println("2.show all student details");
			System.out.println("3.show an Individual student details");
			System.out.println("4.show courses Count by entering student Name");
			System.out.println("5.exit");
			
			System.out.println("Enter your choice");
			choice=sc.nextInt();
			
			switch(choice)
			{
			case 1:acceptStudentDetails();
			       break;
			case 2:showAllStudentDetails();
			       break;
			case 3:showIndividualStudentDetails();
				   break;
			case 4:courseCountByName();
			       break;
			case 5:System.exit(0);
			       
			}
		}
		
	}
	
	private static void printCourseNames(Student result)
	{
		for(int i=0;i<result.getCourseNames().length;i++)
		{
			if(i == result.getCourseNames().length-1)
				System.out.println(result.getCourseNames()[i]);
			else
				System.out.print(result.getCourseNames()[i]+",");
		}
	}

	private static void courseCountByName() {
		System.out.println("Enter name");
		String name=sc.next();
		Student result=studSch.courseCountByName(name);
		if(result != null)
		{
			printCourseNames(result);
		}
		else
		{
			System.out.println("Student Details Not Found,Invalid student name");
		}
	}

	private static void showIndividualStudentDetails() {
		System.out.println("Enter roll number");
		int rollNumber=sc.nextInt();
		
		Student result=studSch.showIndividualStudentDetails(rollNumber);
		if(result!=null)
		{
			System.out.println("Student Name is: "+result.getName());
			
			System.out.print("Courses Enrolled are:");
			printCourseNames(result);
		}
		else
		{
			System.out.println("Student Details Not Found,Invalid Roll Number");
		}
	}

	private static void acceptStudentDetails() {
		System.out.println("Enter roll number");
		int rollNumber=sc.nextInt();
		
		System.out.println("Enter name");
		String name=sc.next();
		
		System.out.println("Enter the no of Courses");
		int noOfCourses=sc.nextInt();
		
		String coursesNames[]=new String[noOfCourses];
		
		for(int i=0;i<coursesNames.length;i++)
		{
			coursesNames[i]=sc.next();
		}
		System.out.println(studSch.addStudent(rollNumber, name, coursesNames));
	}

	private static void showAllStudentDetails() {
		Student[] result=studSch.showAllStudentDetails();
		System.out.println("Student Details are");
		for(int i=0;i<result.length;i++)
		{
			System.out.println(result[i].getRollNumber()+" : "+result[i].getName());
			System.out.print("Courses Enrolled are:");
			printCourseNames(result[i]);
		}
		
	}

}
