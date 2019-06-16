package com.studentDatabaseApplication;

import java.util.Scanner;

public class Student {
	private String firstName;
	private String lastName;
	private int gradeYear;
	private String studentId;
	private int tutionBalance ;
	private String courses;
	private static int costOfCourse = 800;
	private static int id = 1001;
	//User will enter name and year
	public Student()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student First Name  : ");
		this.firstName = sc.nextLine();
		System.out.println("Enter Student Last Name   : ");
		this.lastName = sc.nextLine();
		System.out.println("1 - Freshman\n2 - Sophmore\n3 - Junior\n4 - Senior\nEnter Student Grade Level : ");
		this.gradeYear = sc.nextInt();
		setId();
		System.out.println("");
	}
	//Generate ID
	private String setId()
	{
	//Grade Level + ID
		id++;  //Id will be incremented
		this.studentId =gradeYear + "" + id;
		return studentId;
	}
	
	public void selectOption()
	{
			Scanner sc = new Scanner(System.in);
			System.out.println();
			System.out.println("Please choose the option : ");
			System.out.println("1 - Enroll in course\n2 - View Balance\n3 - Pay Due Payment\n4 - Show Information");
			String option = sc.next();
			if(option.equals("1"))
			{
				enrollCourse();
			}
			else if(option.equals("2")){
				viewBalance();
			}else if(option.equals("3"))
			{
				payTution();
			}
			else if(option.equals("4"))
			{
				showInfo();
			}
			else{
				
			}
	}
	
	//Enroll in courses
	
	public void enrollCourse()
	{
		//Go inside the loop
		//user hit 0 when they are done
			do{
					System.out.print("Enter course to enroll or 'Q' to quit : ");
					Scanner in = new Scanner(System.in);
					String course = in.nextLine();
				if(!course.equals("Q"))
				{
						courses = courses  + "\t " +  course;
						tutionBalance = tutionBalance + costOfCourse;
				}
				else{
					break;
				}
			}while(1 != 0);
				System.out.println("Tution Balance : " + tutionBalance);
	}
	//View balance
	public void viewBalance()
	{
		System.out.println("Balance is : " + tutionBalance);
	}
	
	//Pay tution
	public void payTution()
	{
		viewBalance();
		System.out.print("Enter the payment : $ ");
		Scanner sc = new Scanner(System.in);
		int payment = sc.nextInt();
		tutionBalance = tutionBalance - payment;
		System.out.println("Tution Balance : " + tutionBalance);
		System.out.println("****THANK YOU FOR YOUR PAYMENT OF : " + payment);
		
	}
	//Status of students
	public void showInfo()
	{
		System.out.println("First Name : " + firstName + "\nLast Name : " + lastName + "\nGrade Year : " + gradeYear + "\nStudent Id : " + studentId + "\nCourses Enrolled : " + courses + "\t" + "\nBalance : " + tutionBalance);
	}
}
